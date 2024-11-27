// Write a program that takes age of te user and and determine weather that 
// person is eligible for vote or not .

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter Your age ?");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        canVote(a);
        sc.close();
    }
    public static void canVote(int age) {
        if(age >= 18){
            System.out.println("You can Vote !");
        }
        else{
            System.out.println("You can't Vote !");
        }
    }
}
