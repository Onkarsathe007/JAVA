
public class Basics {
    public static void main(String[] args) {
        int[] marks = new int[5];  // 1st way .
        @SuppressWarnings("unused")
        int[] age = {1,2,3};       // 2nd Way .
        // Memory allocated : 5 Integers ...4 Bytes per int 
        // 4 x 5 = 20BYTE .
        // Linier Fashion to allocate memory !
        marks[0] = 99 ;
        marks[1] = 97 ;
        marks[2] = 96 ;
        marks[3] = 100 ;
        marks[4] = 99 ;
        // marks [5] = 0;  Error !

        // System.out.println(marks);

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // Using Loop :
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }  
}