import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
         Syntax :
                 switch (args) {
                      case value:
                
                          break;
                
                      default:
                          break;
                  } 
         */
        
        String name,ch;
        int lang_ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey ! Hello whats your name ?");
        name = sc.next();
        System.out.println("Welcome "+name+" Nice to meet You !");
        System.out.println("Curious Learn New Language (Yes/No)?");
        ch = sc.next();
        if(ch.equalsIgnoreCase("Yes"))
        {
            System.out.println("Nice to hear that you want to learn new language!");
            System.out.println("Which language do you want to learn ?(1 for eng ,2 for marathi so on..)");
            System.out.println("1.English\t2.Marathi\t3.Hindi\t4.Japanese" );
            lang_ch=sc.nextInt();
            switch (lang_ch) 
            {
                case 1:
                    System.out.println("Hello , Welcome to your english journey!");
                    break;
                case 2:
                    System.out.println("Namaste , Swagat aahe !");
                    break;
                case 3:
                    System.out.println("AA gye ..wa.., Welcome to your Hindi journey!");
                    break;
                case 4 :
                    System.out.println("Bhai yha japanese nhi padhai jati !");
                    break;

                default:
                    System.out.println("Ug kahi pn btn nko dabu salya!");
                    break;
            }
        }
        else
        {
            System.out.println("No Problem ! ");
        }
        sc.close();

    }

}
