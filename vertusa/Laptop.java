package vertusa;

public class Laptop {
    String brand;
    String model;
    String color;
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }

    public static void main(String[] args) {
        Laptop l=new Laptop();
        System.out.println("Brand: "+l.brand);
        l.brand="HP";
        l.model="DU";
        l.color="Red";
        l.display();
    }
}
