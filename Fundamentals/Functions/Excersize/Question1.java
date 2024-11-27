// Enter 3 numbers from the user & make a function to print their average .
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        average(num1, num2, num3);
        sc.close();
    }
    public static void average(int m1,int m2,int m3){
        int avg = (m1 + m2 + m3) / 3 ;
        System.out.println("Average of entered number is : "+avg);
        
    }
}