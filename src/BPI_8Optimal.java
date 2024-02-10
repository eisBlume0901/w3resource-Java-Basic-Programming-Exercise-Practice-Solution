public class BPI_8Optimal {
    /*
 static int means that it exists till the end of the program once initialized.
 Syntax:
     static data_type variable name; = static int[] aRow
 For instance,
     int = 1 -> it becomes a local variable which can be destroyed as the function
     ends
     static int[]
         -> the variable will not get destroyed as the function ends
         and will not get destroyed until the program ends
         -> only a single copy of static variable is created and shared among
         all the instances of the class
         -> used this if we want a common value for all the instances like
         global variable
         -> a static variable can be accessed directly by the class name
         and does not need any object
         -> global variable
         -> Watch for clarification: https://youtu.be/yn9cDLVr_wk
  */
    static int[] aRow = new int[]{1,1,9,6};
    static int[] bRow = new int[]{8,20,62,65};
    static int[] cRow = new int[]{65,34,20,8};
    static int[] dRow = bRow;

    public static void main(String[] args) {
        for (int i = 0 ; i<4; i++) {

            prnMyText('J', aRow[i], 4);
            /*
            prnMyText is assigned by the programmer
             */
            prnMyText('a', bRow[i], 7);
            prnMyText('v', cRow[i], 7);
            prnMyText('a', bRow[i], 7);
            System.out.print("\n");
        }
    }

    public static void prnMyText(char myChar, int myRow, int length){
        String myJ = "";
        for (int i=0; i< length ;i++) {

            myJ = (myRow % 2 == 0 ? " " : myChar) + myJ;
            myRow = myRow / 2;

        }
        System.out.print(myJ);
    }
}
