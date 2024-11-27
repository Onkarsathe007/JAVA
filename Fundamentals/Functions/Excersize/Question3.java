//Write a program to Enter two numbers and return Greater one.
public class Question3 {
    public static void main(String[] args) {
        findGreater(12, 32);
    }
    public static void findGreater(int no1,int no2) {
        if (no1 > no2) {
            System.out.println(no1+" is Greater !");
        }
        else{
            System.out.println(no2+" is Greater !");
        }
    }
}
