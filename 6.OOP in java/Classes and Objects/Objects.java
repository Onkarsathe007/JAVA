class Animal {
    String color,sound;  
    int age;
    public void run()  
    {
     System.out.println(this.color+" color cat ,whose age is "+ this.age +" is running .");
    }

 }
public class Objects {
    public static void main(String[] args) {
        // Creating an Object .
        Animal cat = new Animal();
        // Assigning value to property color;
        cat.color = "White";
        cat.age = 24;
        // Calling method.
        cat.run();

        Animal dog = new Animal();
        dog.color = "Black";
        dog.age = 24;
        dog.run();
    }
}

