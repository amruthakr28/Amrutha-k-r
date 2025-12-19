//Find Square of a Number
import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        System.out.println("Square = " + square);

        sc.close();
    }
}