import java.util.Scanner;

public class BPI_7 {
    public static void main(String[] args) {
        //My solution
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        int one = num1*1;
        int two = num1*2;
        int three = num1*3;
        int four = num1*4;
        int five = num1*5;
        int six = num1*6;
        int seven = num1*7;
        int eight = num1*8;
        int nine = num1*9;
        int ten = num1*10;

        System.out.printf("8 x 1 = %d\n8 x 2 = %d\n8 x 3 = %d\n8 x 4 = %d\n8 x 5 = %d\n8 x 6 = %d\n8 x 7 = %d\n8 x 8 = %d\n8 x 9 = %d\n8 x 10 = %d\n ",
                one, two, three, four, five, six, seven, eight, nine, ten);

        System.out.println();
        /*No answers since there is no format specifiers.
        Always put %d - decimal (integer) number (base 10)
         */
        System.out.printf("8 x 1 = \n8 x 2 = \n8 x 3 = \n8 x 4 = \n8 x 5 = \n8 x 6 = \n8 x 7 = \n8 x 8 = \n8 x 9 = \n8 x 10 = \n ",
                one, two, three, four, five, six, seven, eight, nine, ten);

        //Optimal Solution from w3Resource
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        /*Solution1
        Syntax of for
        Statement 1
        - int is the data type declared with the variable i
        - i is assigned with the value of 0 which pertains that the loop will begin
        at 0

        Statement 2
        - i less than 10 is the condition (Note that this is not what pertaining
        to a number to be multiplied up to 10 but rather the condition on how
        many times the loop will be and that condition will be compared to every loop)

        Statement 3
        - i++ is set as it increases the value for loop (does not relate to
        multiplication)

        Summary
        - The loop will begin at 0 until it stops or reaches before 10. After
        each iteration of the loop, the value of i increments by 1 (++).

        Why we need to put i++? So that the loop will reach before 10.
        */
        for (int i=0; i<10; i++) {
            System.out.println(number + " x " + (i+1) + " = " + (number*(i+1)));
        }

        System.out.println();

        //Solution2
        for (int i=1; i <=10; i++) {
            System.out.println(number + "*" + i + " = " + (number * i));
        }

    }
}
