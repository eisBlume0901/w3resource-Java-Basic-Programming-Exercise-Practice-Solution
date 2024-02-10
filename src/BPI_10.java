public class BPI_10 {
    public static void main(String[] args) {
        //My solution
        System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));

        /*Optimal solution
        Notice that direct printing the result still gives precision as
        assigning the problem with double*/
        double result = 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println(result);

    }
}
