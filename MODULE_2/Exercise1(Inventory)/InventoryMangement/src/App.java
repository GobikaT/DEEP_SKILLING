public class App {
    public static void main(String[] args) throws Exception {
        Inventory obj=new Inventory();
       Product p1 = new Product(101, "Laptop", 50000, 10);
        Product p2=new Product(102,"Mouse",4000,8);
        Product p3=new Product(103,"Motherboard",4458,14);
        obj.addproduct(p1);
        obj.addproduct(p2);
        obj.updateProduct(101, "Keyboard", 4000, 3);
        obj.deleteProduct(102);
        obj.displayProduct();
    }
}
