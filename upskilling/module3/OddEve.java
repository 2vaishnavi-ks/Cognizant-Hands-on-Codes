package module3;

import java.util.Scanner;

public class OddEve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        scan.close();

        if(num%2 == 0)
            System.out.println("The number is even !");
        else
            System.out.println("The number is odd !");
    }
}
