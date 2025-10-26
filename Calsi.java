import java.util.Scanner;

public class Calsi {
    public static int addition(int a,int b){
        return a+b;
    }
    public static int  subtraction(int a,int b){
        return a-b;
    }
    public static int  multiplication(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("For Addition Enter +, for  Subtraction Enter -, For Multiplication Enter *");
       String str=sc.next();
        switch(str){
            case "+":System.out.println(addition(a,b));
                break;
            case "-":System.out.println(subtraction(a,b));
                break;
            case  "*":System.out.println(multiplication(a,b));
                break;
            default: System.out.println("Invalid Input");

        }

    }
}
