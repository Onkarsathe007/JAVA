import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int sq = square(no);
        System.out.println("Square = "+sq);
    }
    public static int square(int num)
    {
        return num * num;
    }
}
