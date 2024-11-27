// Compile Time polymorphism Function Overloading 
// - Different functions with same name
// It have different return type.
// Different type of arguments.
/**
 * Example
 */
/**
 * Student
 */
class Student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name is "+name);
    }
    public void printInfo(int age){
        System.out.println("Age is "+age);
    }
    public void printInfo(String name,int age){
        System.out.println("Name is "+name+" & Age is "+age);
    }
    
}
public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Onkar");
        s1.printInfo(12);
        s1.printInfo("Onkar",18);
    }
}