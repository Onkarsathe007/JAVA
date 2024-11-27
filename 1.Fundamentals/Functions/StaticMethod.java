/**
 * StaticMethod
 * 
 * --Here that we are simply going to distinguish between the normal methods and the static methods !
 * 
 */
public class StaticMethod {

    public static void main(String[] args) {
    StaticMethod m1= new StaticMethod();
    int num = 1;
    m1.increment(num);
    m1.increment(num);
    m1.increment(num);
    m1.increment1(num);
    m1.increment1(num);
    m1.increment1(num);
    }
    public void increment(int num)
    {
        num++;
        System.out.println(num);
    }
    public static void increment1(int num)
    {
        num++;
        System.out.println(num);
    }
}