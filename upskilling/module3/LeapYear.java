package module3;

import java.util.Scanner;

public class LeapYear {
    public static boolean leap(int yr){
        if(yr % 4 != 0)
            return false;
        else if(yr % 100 != 0)
            return true;
        else
            return (yr % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an year : ");
        int year = scan.nextInt();
        scan.close();

        if(leap(year))
            System.out.println("The year "+year+" is a leap year !");
        else
            System.out.println("The year "+year+" is not a leap year !");

    }
}
