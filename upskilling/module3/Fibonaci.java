package module3;

public class Fibonaci {
    public static void fibNum(int num){
        int first = 0, second = 1;
        if(num>=1)
            System.out.print(first+" ");
        if (num>=2)
            System.out.print(second+" "); 
        for(int i = 3; i<num; i++){
            int next = first+second;
            System.out.print(next+" ");
            first = second; 
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("The fibonacci series include : ");
        fibNum(1);
    }
}
