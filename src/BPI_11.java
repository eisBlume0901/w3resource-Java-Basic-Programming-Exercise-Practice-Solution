import java.util.Scanner;

public class BPI_11 {
    public static void main(String[] args) {
        //My Solution
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        double areaCircle = Math.PI*Math.pow(radius, 2);
        /*Math.PI is a constant for pi
        * Math.pow(value,power/raise to)
        For example:
        Math.pow(2,3) The result would be 8*/
        double perimeterCircle = 2*Math.PI*radius;
        System.out.println();
        System.out.println("The area of the circle is: "+areaCircle);
        System.out.println("The perimeter of the circle is: "+perimeterCircle);

    }
}
