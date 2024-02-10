import java.util.Scanner;

public class BPI_5 {
    public static void main(String[] args) {
        //My Solution
        Scanner in = new Scanner (System.in);
        /*Based on BPI_1 to 1,2, and 3 the variable declared is input but
        based on w3Resource, you can also put variable name you like, for
        instance, in*/
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        int product = num1*num2;
        System.out.println();
        System.out.println("The product of two numbers is: "+product);
    }
}
