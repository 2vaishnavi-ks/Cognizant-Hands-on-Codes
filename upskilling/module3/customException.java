package module3;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class customException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        try{
            if(age<18){
                throw new InvalidAgeException("Age must be above 18 !!!");
            }
            System.out.println("You are eligible");
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
        scan.close();
    }
}
