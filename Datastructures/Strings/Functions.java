public class Functions {
    public static void main(String[] args) {
        String fname = "Onkar";
        String lname = "Sathe";
        // Without using 'concat()' function .
        // 1. Concatenation using '+' operator .
        String fullName = fname +"" + lname;
        System.out.println(fullName);
        // 2. length().
        System.out.println(fullName.length());
        // 3. chatAt()
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i)+"\t");
        }   
        // 4 .compareTo()
        if (fname.compareTo(lname) == 0) {
            System.out.println("Equal");
        }
        else{
            System.out.println("Strings are not equal . ");
        }
    }
}
