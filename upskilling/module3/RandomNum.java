package module3;

import java.util.Scanner;
import java.util.Random;


public class RandomNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number from 1 to 100 : ");
        int guessNum = scan.nextInt();

        int randNum = random.nextInt(100);

        while(true){
            if(guessNum == randNum){
                System.out.println("You guessed the right number !");
                break;
            }
            else if (guessNum < randNum){
                System.out.print("Guess a bigger number : ");
                guessNum = scan.nextInt();
            }
            else if(guessNum > randNum){
                System.out.print("Guess a smaller number : ");
                guessNum = scan.nextInt();
            }
        }
        scan.close();

    }
}
