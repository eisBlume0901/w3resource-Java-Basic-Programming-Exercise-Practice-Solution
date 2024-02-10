import java.util.Scanner;

public class BPI_13 {
    public static void main(String[] args) {
        //My Solution
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println();
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("The perimeter of the rectangle is: "+perimeter);
    }
}
