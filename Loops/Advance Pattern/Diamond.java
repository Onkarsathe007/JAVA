public class Diamond {
    public static void main(String[] args) {
        int num = 4;
        // Upper Pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Downer Pattern 
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < num-i; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
