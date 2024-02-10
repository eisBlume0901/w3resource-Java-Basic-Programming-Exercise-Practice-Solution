import java.util.Scanner;

public class BPI_12 {
    public static void main(String[] args) {
        //My Solution
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = input.nextInt();
        int average = ((firstNumber+secondNumber+thirdNumber)/3);
        System.out.println();
        System.out.println("The average of three numbers is: "+average);

        //Optimal Solution from w3Resource
        double num = 0;
        double x = 1;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number you want to calculate the average: ");
        int n = in.nextInt();
        while (x <= n) {
            /*
            while is used since it loops through a block of code
            as long as the specified condition is true. In this case,
            the value assigned for x is 1 and the condition states that
            x is less than or equal to n which is true.

            The reason why the value of x is 1 since it pertains to the first
            number to be inputted by the user. It should not be 0 since we are
            calculating average. Average is defined as the median value for
            at least two values.
             */
            System.out.println("Enter the number " + "(" + (int) x +")" + ":");
           /* (int) in line 24 uses the value assigned of int in line 22.
           This is done to avoid repetition of input function.

           (int) x is narrow casting or explicit typecasting. It is the
           process of conversion of a higher data type to lower data type.
           Double is explicitly typecast to int (Ex: 9.78d -> 9)

           Why System.out.println is only one? Because it is a code block
           to be executed by while loop. Thus, it will print out lots of copies
           of itself as long as x will not be 1.
            */
            num += in.nextInt();
            /* num is assigned with the value of 0 which will be added
            with the newly inputted number entered by the user.
            Why this code of block is only one? Because it is a code block
            to be executed by while
            loop.
             */
            x += 1;
            /* The System.out.println includes x which pertains to the label
            of the first number and so on. Then the value of x which is 1 is
            added with 1 all the time and so on depending on how many numbers
            to be calculated for the average.
             */
        }

        double median = (num/n);
        System.out.println("The average is: "+median);


    }
}
