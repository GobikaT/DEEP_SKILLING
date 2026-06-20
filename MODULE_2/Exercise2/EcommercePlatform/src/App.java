public class App {
    public static void main(String[] args) throws Exception {
        Product[] product={new Product(101,"Lapton","Electronics"),
                           new Product(103,"Keyboard","Electronics"),
                           new Product(102,"Shoes","Fashion"),
                           new Product(105,"Watch","Accessories")
        };
        Product[] productBinary={new Product(101,"Laptop","Electronics"),
                           new Product(102,"Keyboard","Electronics"),
                           new Product(103,"Shoes","Fashion"),
                           new Product(105,"Watch","Accessories")
        };
        int searchId=103;
       
        Product obj=EcommerceSearch.linearSearch(product, searchId);
        Product obj2=EcommerceSearch.binarySearch(productBinary, searchId);
        if(obj!=null){
            System.out.println(obj);
        }
        else{
            System.out.println("product not found");
        }
        if(obj2!=null){
            System.out.println(obj2);
        }
        else{
            System.out.println("product not found");
        }


    }
}
