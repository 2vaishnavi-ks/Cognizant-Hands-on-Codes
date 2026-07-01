class Order{
    private int orderId;
    private String customerName; 
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice){
        this.totalPrice = totalPrice;
        this.customerName = customerName;
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order : orderId=" + orderId + ", customerName=" + customerName + ", totalPrice=" + totalPrice + " ";
    }
}
class SortPrices{
    /*public void bubbleSort(Order[] o){
        int n = o.length;
        boolean swap;
        for(int i = 0; i<n-1; i++){
            swap = false;
            for(int j = 0; j<n-i-1; j++){
                if(o[j].getTotalPrice() > o[j+1].getTotalPrice()){
                    Order temp = o[j];
                    o[j] = o[j+1];
                    o[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }*/
   public int quickSort(Order[] o, int start, int end){
        int init = start-1;
        double pData = o[end].getTotalPrice();
        for(int trv=start; trv<end; trv++){
            if(o[trv].getTotalPrice() < pData){
                init++;
                Order third = o[init];
                o[init]=o[trv];
                o[trv]=third;
            }
        }
        Order third = o[init+1];
        o[init+1]=o[end];
        o[end]=third;
        return init+1;
    }
    public void split(Order[] o, int start, int end){
        if(start<end){
            int pIndex = quickSort(o, start, end);
            split(o, start, pIndex-1);
            split(o, pIndex+1,end);
        }
    }
    public void displayProducts(Order[] order) {
        for(Order o : order ) {
            System.out.println(o);
        }
    }
}
public class SortingOrders {
    public static void main(String[] args) {
        Order[] order = new Order[7];
        order[0] = new Order(1001, "Rezaak", 12300);
        order[1] = new Order(1002, "Tanish", 3200);
        order[2] = new Order(1003, "Arya", 1000);
        order[3] = new Order(1004, "Vaish", 50000);
        order[4] = new Order(1005, "Becky", 6500);
        order[5] = new Order(1006, "Vijay", 500);
        order[6] = new Order(1007, "Sushma", 4000);

        SortPrices sort = new SortPrices();
        System.out.println("The orders are as follows : ");
        sort.displayProducts(order);

        // System.out.println("After sorting based on the price : ");
        // long start = System.nanoTime();
        // sort.bubbleSort(order);
        // long end = System.nanoTime();
        // sort.displayProducts(order);
        // System.out.println("total execution time taken for bubble sort : "+(end - start)+" nanosec");

        System.out.println("After sorting based on the price : ");
        long start = System.nanoTime();
        sort.split(order, 0, order.length-1);
        long end = System.nanoTime();
        sort.displayProducts(order);
        System.out.println("total execution time taken for quick sort : "+(end - start)+" nanosec");


    }
}
