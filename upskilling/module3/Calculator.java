package module3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, result=0;
        char op;
        System.out.println("Enter teo numbers : ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        
        System.out.println("Enter the operator : ");
        op = scan.next().charAt(0);
        if(op == '+')
            result = num1+num2;
        else if (op == '-')
            result = num1-num2;
        else if (op == '*')
            result = num1*num2;
        else{
            if(num2 > 0)
                result = num1/num2;
            else
                System.out.println("Cant divide by zero");
        }
        System.out.println("The result is : " + result);
    }
}
