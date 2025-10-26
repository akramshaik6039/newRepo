package vertusa;

public class Stringss {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        String str3=new String("abc");
        String str4=new String("abc");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        String str5=str3.intern();
        System.out.println(str5==str1);
        String str6=new String("abc").intern();
        System.out.println(str6==str5);
    }
}
