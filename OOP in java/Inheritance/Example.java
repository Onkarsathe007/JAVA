/**
 * Example
 */
class Human {   //Base Class.
    String name = "HUMAN";
    double IQ = 150;
    String Intelligence = "HIGH_LEVEL";
    String Super_Power = "Questioning"; 
}

class Student extends Human{ //Child class.
    public void printData(){
        System.out.println("Hey ! I am "+name+"\n I've "+Intelligence+" Intelligence ,With super power of \'"+Super_Power+"\'.");
    }
}
public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printData();
    }
}