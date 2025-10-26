import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        String Age = sc.nextLine();
        System.out.println("Enter Your Address");
        String Address = sc.nextLine();
        System.out.println("                          Details                           ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
    }
}
