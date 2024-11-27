// Write a Function to print the sum of all odd numbers from 1 to n ;

import java.util.Scanner;

public class Question2 {
    public  static void main(String[] args) {
        calculate();
    }
    public static void calculate(){
        System.out.println("Enter a \'nth\' term : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                sum+=i;
            }
        }
        System.out.println("Sum of all the odd numbers till \'"+n+"\' is "+sum);    
        sc.close();
    } 
}