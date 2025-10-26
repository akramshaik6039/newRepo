package vertusa;

abstract class Animal{
    abstract void eat();
    public void sleep(){
        System.out.println("sleeping");
    }

}

class Dog2 extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleep");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat();
        d.sleep();
    }
}
