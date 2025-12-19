//Reverse a String Using Recursion
import java.util.Scanner;

public class reversestring {
    static String reverse(String s) {
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String = " + reverse(str));
        sc.close();
    }
}