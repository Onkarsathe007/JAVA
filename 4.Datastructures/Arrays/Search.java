import java.util.Scanner;
// Linear Search !
public class Search {
    public static void main(String[] args) {
        int size = 10;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter a Element that You want to Search !");
        int ele = sc.nextInt(); 
        // arr.length - Property that determines length of array.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele ) {
                System.out.println("Element Found, at Index "+i);
            }
        }
        sc.close();
    }
}
