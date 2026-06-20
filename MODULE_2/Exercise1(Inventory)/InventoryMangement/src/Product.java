public class Product {
  private int productId;
  private String productName;
  private double price;
  private int quantity;
  Product(int productId, String productName, double price, int quantity) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }
  public int getProductId(){
    return productId;
  }
  public String getProductName(){
    return productName;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
  public void setProductName(String name){
    this.productName=name;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public void setQuantity(int quantity){
    this.quantity=quantity;
  }
  public String toString(){
    return "ProductId : "+productId+", ProductName : "+productName+
    ", Price :"+price+", Quantity : "+quantity;
  }
}
