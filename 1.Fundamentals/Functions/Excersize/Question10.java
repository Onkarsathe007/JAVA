/**
 * Question10 : Fibonacci
 */
public class Question10 {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1;
        int c;
        int no = 10;  //N'th term
        int count = 0;
        do {
            c = a + b;
            a = b;
            b = c;
            System.out.print(a+"\t");
            count++;
        }while(count < no);
    }
}