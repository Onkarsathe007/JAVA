class Animal{
    // Default Constructor
    String name;
    Animal()
    {
        System.out.println("Default Constructor Invoked !");
    }
    // Parametrized Constructor
    Animal(String name){
        this.name = name;
    }

    // Copy Constructor
    Animal(Animal a){
        this.name = a.name;
    }

    void printName(){
        System.out.println("Name : "+this.name);
    }

}
public class Constructors {
    public static void main(String[] args) {
        // When the Object of the 'Animal' is called, Constructor will be invoked .
        
        Animal cat = new Animal("mew");
        Animal goat = new Animal("Virat");

        Animal dog = new Animal(goat);
        dog.printName();
    }
}
