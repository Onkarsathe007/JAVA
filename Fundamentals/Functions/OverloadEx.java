/**
 * OverloadEx
 */
public class OverloadEx {
    public static void main(String[] args) {
        sum(12,12);
        sum("onk","sathe");
    }   
    public static void sum(int no1,int no2){
        System.out.println("Addition : "+(no1 + no2));
    }
    public static void sum(String str1,String str2){
        System.out.println("Concatenated String :"+str1 + str2);
        return;
    }
}