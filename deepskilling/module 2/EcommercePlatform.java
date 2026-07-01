
class Product{
    private int productId;
    private String productName , category;

    public Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
    }

}
class Search{
    public int linearSearch(Product[] p, int index){
        for(int i = 0; i<p.length; i++){
            if(index == p[i].getProductId())
                return i;
        }
        return -1;
    }
    public int binarySearch(Product[] p, int target){
        int left = 0, right = p.length-1;
        while(left<=right){
            int mid = left+ (right - left)/2;
            if(p[mid].getProductId() == target)
                return mid;
            else if(p[mid].getProductId() > target)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }
    public void displayProducts(Product[] pro) {
        for(Product p : pro) {
            System.out.println(p);
        }
    }
}
public class EcommercePlatform {
    public static void main(String[] args) {
        Product[] prod = new Product[5];
        prod[0] = new Product(101, "Laptop", "Electronics");
        prod[1] = new Product(102, "Bottle", "Plastic");
        prod[2] = new Product(103, "Pen", "Stationary");
        prod[3] = new Product(104, "Chair", "Furniture");
        prod[4] = new Product(105, "Car","Automobile");

        
        Search search = new Search();
        search.displayProducts(prod);

        long start = System.nanoTime();
        int index = search.linearSearch(prod, 104);
        long end = System.nanoTime();
        if(index >=0){
            System.out.println("Found in index : "+index);
        }
        else
            System.out.println("Element not found !");
        System.out.println("total execution time taken for linear search : "+(end - start));

        long st = System.nanoTime();
        int in = search.binarySearch(prod, 101);
        long ed = System.nanoTime();
        if(in >=0){
            System.out.println("Found in index : "+in);
        }
        else
            System.out.println("Element not found !");
        
        System.out.println("total execution time taken for binary search : "+(ed - st));
        
    }
}
