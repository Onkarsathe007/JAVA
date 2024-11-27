import java.util.Scanner;

class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();
        int cols  = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        // numbers[0][0] = 1;
        // numbers[0][1] = 2;
        // numbers[1][0] = 3;
        // numbers[1][1] = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               System.out.print(numbers[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}