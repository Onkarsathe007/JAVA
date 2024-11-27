import java.util.Scanner;
    /**
     * Arithmetic
     */
    public class Arithmetic {

        public static void input()
        {
            System.out.println("Enter Two Number's :");
            Scanner sc = new Scanner(System.in);
            int no1 = sc.nextInt();
            int no2 = sc.nextInt();
            System.out.println("Addition ="+(no1+no2));
            System.out.println("Substation ="+(no1-no2));
            System.out.println("Multiplication ="+(no1*no2));
            System.out.println("Division ="+(no1/no2));
        } 
    public static void main(String[] args) {
      input();
    }
}

