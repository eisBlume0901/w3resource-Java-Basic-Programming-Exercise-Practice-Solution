import java.util.Scanner;

public class BPI_2 {
    public static void main(String[] args) {
        //My Solution
        int x = 74;
        int y = 36;
        int z = x + y;
        System.out.println(z);

        //Sample solution (from w3Resource)
        System.out.println(74+36);

        //Sample Solution using input from the user (Modified from w3Resource)
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt(); /*nextInt() method is used to scan
        the next token of the input as an int. This method returns the int value
        scanned from the input.

       Notice that it's syntax is
       input.nextInt() which literally means input integer number
        */
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("The sum of two numbers is: "+sum);
    }
}
