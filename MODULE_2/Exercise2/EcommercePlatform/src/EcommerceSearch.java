public class EcommerceSearch {
  public static Product linearSearch(Product[] product,int target){
    for(Product p:product){
      if(p.productId==target){
        return p;
      }
    }
    return null;
  }
  public static Product binarySearch(Product[] product, int target){
    int left=0;
    int right=product.length-1;
    while(left<=right){
      int mid=left+(right-left)/2;
      if(product[mid].productId==target){
        return product[mid];
      }
      else if(product[mid].productId<target){
        left=mid+1;
      }
      else{
        right=mid-1;
      }
    }
    return null;
  }
}
