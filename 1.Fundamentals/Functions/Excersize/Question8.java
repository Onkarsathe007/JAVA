import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Expression : x^n ");
        System.out.println("Enter value of \'X\' : ");
        double x = sc.nextInt();
        System.out.println("Enter value of \'N\' : ");
        double n = sc.nextInt();
        double res = Math.pow(x, n);
        System.out.println("Result = "+res);
        sc.close();
        }
}
