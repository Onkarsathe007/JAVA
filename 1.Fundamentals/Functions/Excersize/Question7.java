// Write a program to enter a numbers still user wants and at the end it should 
// count and display +ve ,-ve and 0's entered ! 

import java.util.Scanner;

/**
 * Question7
 */
public class Question7 {
    public static void main(String[] args) {
        System.out.println("Enter Nth term?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int neg=0 ;
        int pos=0;
        int zer =0 ;
        for (int i = 1; i <= n; i++) {
            int no =sc.nextInt();
            if(no>0)
            {
                pos++;
            }
            if (no<0) {
                neg++;
            }
            if (no == 0) {
                zer++;
            }
        }
        System.out.println("Positive Numbers : "+pos);
        System.out.println("Negative Numbers " +neg);
        System.out.println("Zero's " +zer);
        sc.close();                   
    }
}
