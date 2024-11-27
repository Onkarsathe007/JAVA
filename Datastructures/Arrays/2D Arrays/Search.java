import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        // Creating an array :
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter a number of rows :");
        rows = sc.nextInt();
        System.out.println("Enter a number of cols :");
        cols = sc.nextInt();
        
        System.out.println("Ohh  ! You want "+rows+" x "+cols+" Array !");

        // Declaring an array  :
        int[][] arr = new int[rows][cols];

        System.out.println("Now Enter Your Values : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at arr["+i+"]"+"["+j+"]"+" :");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a Element that you want to search ?");
        int ele  = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               if (arr[i][j] == ele ) {
                  System.out.println("Element found !");
                  System.out.println("Row : "+i);
                  System.out.println("Column : "+j);
               }
            }
        }


System.out.print("Your array is : \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }

    }
}
