import java.util.Scanner;

public class BPI_6 {
    public static void main(String[] args) {
        //My solution
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int modulus = num1 % num2;
        System.out.println();
        System.out.println("The sum of two numbers is: "+sum);
        System.out.println("The difference of two numbers is: "+difference);
        System.out.println("The product of two numbers is: "+product);
        System.out.println("The quotient of two numbers is: "+quotient);
        System.out.println("The modulus of two numbers is: "+modulus);

        System.out.println();

        //Can be printed in one line. Solution derived from w3Resource
        System.out.printf("Sum = %d\nDifference = %d\nProduct = " +
                "%d\nQuotient = %d\nRemainder = %d\n ",sum, difference,product, quotient,
                modulus);
        /*Syntax used: System.out.printf(Format, arguments)
        %d - decimal (integer) number (base 10)*/
    }
}
