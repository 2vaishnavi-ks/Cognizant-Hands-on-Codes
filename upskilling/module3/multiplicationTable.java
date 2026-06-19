package module3;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        scan.close();

        System.out.println("Multiplication table is : ");
        for(int i =1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        
    }
}
