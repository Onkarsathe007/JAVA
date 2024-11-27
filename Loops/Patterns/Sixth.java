public class Sixth {
    public static void main(String[] args) {
        // Pattern :
        /*
         * 
         *         *
         *        ***
         *       *****
         *        ***
         *         *
         */
        int no = 5;
        for (int i = 1; i <= no; i++) {

            for (int j = 1 ; j <= no - i; j++) {   //Triangular Reverse Pyramid !
                System.out.print(" ");
            } 
            
            for (int j = 1; j <= i; j++) {          //Triangular Pyramid
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {          //Triangular Pyramid
                System.out.print("*");
            }
           System.out.println();

        }
        for (int i = 1; i <= no; i++) {

            for (int j = 1; j <= i; j++) {          //Triangular Pyramid
                System.out.print(" ");
            }

            for (int j = 1 ; j <= no - i; j++) {   //Triangular Reverse Pyramid !
                System.out.print("*");
            } 
            for (int j = 1 ; j < no - i; j++) {   //Triangular Reverse Pyramid !
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
