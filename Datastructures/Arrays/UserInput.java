import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Subjects : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Your Marks :");
   
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int per;  
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        per = sum / arr.length;
        if (per > 90) {
            System.out.println("Wo hoo ! Congratulations !\n You got "+per+" %");
        }
        System.out.println("Your Marks : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
