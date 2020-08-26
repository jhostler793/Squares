import java.util.Scanner;

public class SquaresLoops {
    public static void main(String[] args) {
        // Write a program to display the #'s from 1 to user specified and their squares using a for loop.

       // 1) Store user input in input variable

        // 2) Create a loop that squares the #

int userInput;
Scanner keybd = new Scanner(System.in);
System.out.println("Enter a number: ");
userInput = keybd.nextInt();
for (int i = 1; i <= userInput; i++){
    System.out.println(i + ":" + i*i);
}



    }
}
