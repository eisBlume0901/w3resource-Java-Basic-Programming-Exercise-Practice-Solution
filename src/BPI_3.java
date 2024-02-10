import java.util.Scanner;

public class BPI_3 {
    public static void main(String[] args) {
        //My solution now learned how to use Scanner and nextInt()
        /*This is the same with the sample solution using input from the user
        from w3Resource */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int quotient = num1/num2;
        System.out.println();
        System.out.println("The quotient of two numbers is: "+quotient);

        //Sample solution from w3Resource
        System.out.println(50/3);
    }

}
