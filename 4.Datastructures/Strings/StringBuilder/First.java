/**
 * First
 */
public class First {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Onkar Sathe");
        System.out.println(sb);

        //chatAt()
        System.out.println(sb.charAt(0));

        // setCharAt
        sb.setCharAt(1, 'm');
        System.out.println(sb);

        // insert
        sb.insert(5, '_');
        System.out.println(sb);

        // replace
        sb.replace(6, 7, "");
        System.out.println(sb);

        // delete
        sb.delete(0, 6);
        System.out.println(sb);

      
        // append
        char[] name = {' ','S','H','U','B','H','A','M'};
        sb.append(name);
        System.out.println(sb);

        // length
        System.out.println(sb.length());

        // Lets Reverse a String :
        for (int i = sb.length()-1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
    }
}