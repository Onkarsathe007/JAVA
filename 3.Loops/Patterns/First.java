class First {
    public static void main(String[] args) {
        /*   Y Axis
         *   | *****
         *   |*****
         *   |*****
         *   |*****
             +-------- X Axis
        */
        // Using for loop

        for (int i = 1; i <= 4; i++) {  //For no of columns
            for (int j = 1; j <= 10; j++) {  //For no of *'s in a row
                System.out.print("*");
            }   
            System.out.print("\n");
        }
    }
}