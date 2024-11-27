class GrandFather{
    String name = "Arjun";
    String ability = "Read";
    String occupation = "Business";
    String bodyColor  = "White";
    String Nation  = "India";
}
class Father extends GrandFather{
    String name = "Abasaheb";
    String Skill = "Cricket Champ";
}
class Child extends Father {
    String name = "Onkar";
    public void printData(){
        System.out.println("Hey ! My name is "+name+"\n I've Ability to "+super.ability+"\n Plus I've a skill set of"+super.Skill);
    }
}
public class Example{
    public static void main(String[] args){
        Child shu =  new Child();
        shu.printData();
    }
}