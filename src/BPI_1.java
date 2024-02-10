import java.util.Scanner;

public class BPI_1 {
    public static void main(String[] args) {
        //My Solution
        String myName = "Mary Kate Franco Anecito";
        System.out.println("Hello\n".concat(myName));

        //Sample Solution (from w3Resource)
        System.out.println("Hello\nAlexandra Abramov!");

        //Sample Solution using input from the user (Modified from w3Resource)
        Scanner input = new Scanner (System.in); //import java.util.Scanner automatically
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();
        System.out.println();
        System.out.println("Hello\n"+ firstName + " " + lastName);
  }
}
