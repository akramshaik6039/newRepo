package vertusa;

import java.util.Scanner;

public class Employee {
    String name;
    String position;
    String age;
Employee(String name,String position,String age){
    this.name = name;
        this.position = position;
        this.age = age;
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("Position: "+position);
    System.out.println("Age: "+age);
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Limit :");
        int limit = input.nextInt();
        Employee [] array = new Employee[limit];
        for(int i = 0; i < limit; i++){
            System.out.println("Enter Name :");
            String name = input.next();
            System.out.println("Enter Position :");
            String position = input.next();
            System.out.println("Enter Age :");
            String age = input.next();
            array[i]= new Employee(name,position,age);

        }
        for(int i = 0; i < limit; i++){
            array[i].display();
        }


    }
}
