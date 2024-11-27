// Write a function that takes a radius as its input and returns the circumference .

public class Question4 {
    public static void main(String[] args) {
        double circum = calculate(5);  //Passing radius
        System.out.println("Circumference of circle is "+circum);
    }   
    public static double calculate(int r) {
        return 2 * 3.14 * r * r;
    }
}
