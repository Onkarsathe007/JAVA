// Creating an Class.
 class Animal {
   String color;  //First Property .
   int age;
   public void run()  //Method of the class .
   {
    System.out.println(this.color + " is running .");
   }
}
public class Classes {
    public static void main(String[] args) {
        Animal cat = new Animal(); //Creating a Object Of a class.
        // When we use 'new' keyword then memory will be allocated to 
        // the object of that class 
        cat.run();
        }
}