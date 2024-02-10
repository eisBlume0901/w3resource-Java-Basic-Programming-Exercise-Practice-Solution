public class BPI_9 {
    public static void main(String[] args) {
        //My Solution
        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));

        //Optimal Solution
        double a = 25.5; //Assigning a variable and using double as the data type
        double b = 3.5; //for precise decimal point answer
        double c = 40.5;
        double d = 4.5;

        System.out.println((a*b-b*b)/(c-d));
    }

}
