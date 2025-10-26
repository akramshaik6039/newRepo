package coding;

public class Palindrom {
    public static void main(String[] args) {

        int num=121;
        int xerox=num;
        int rev=0;
        while(num>0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
       if(rev==xerox){
           System.out.println(rev+" is Palindrom");
       }
       else{
           System.out.println(rev+" is not Palindrom");
       }
    }
}
