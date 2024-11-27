import java.util.Scanner;
public class IfElse {
 public static void main(String[] args) {
    /*
        | Syntax:
           if(condition){
           Statement
           }
           else if(condition){
           Statement
           }
           else{
           Statement
           }
    */
    int age;
    System.out.println("Enter your age : ");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();

    if (age>18)
    {
        System.out.println("You are eligible to vote !");
    }
    else{
        System.out.println("Unable to vote !");
    }
    sc.close();
 }
}