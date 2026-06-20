import java.util.HashMap;
public class Inventory {
  private HashMap<Integer,Product> inventorymap;
  public Inventory(){
    inventorymap=new HashMap<>();
  }
  public void addproduct(Product product){
    if(inventorymap.containsKey(product.getProductId())){
     System.out.println("Product already exists");
     return;
    }
    inventorymap.put(product.getProductId(),product);
    System.out.println("Product successfully added");
  }
  public void updateProduct(int id,String name,double price,int quantity){
    Product product=inventorymap.get(id);
    if(product==null){
      System.out.println("Product does not exists");
      return;
    }
    product.setProductName(name);
    product.setPrice(price);
    product.setQuantity(quantity);
    System.out.println("Product updated successfully.");
  }
  public void deleteProduct(int id){
    if(inventorymap.remove(id)!=null)
{
System.out.println("Successfully removed");
}
else{
System.out.println("product not found");
}
  }
  public void searchProduct(int id){
    Product product=inventorymap.get(id);
    if(product!=null){
      System.out.println(product);
    }
    else{
      System.out.println("product not found");
    }
  }
  public void displayProduct(){
    if(inventorymap.isEmpty()){
      System.out.println("Inventory is empty");
      return;
    }
    for(Product p:inventorymap.values()){
      System.out.println(p);
    }
  }
}
