package vertusa;

public class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Dog Name: " + name;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Dog){
            return this.name.equals(((Dog)o).name);
        }
        return false;
    }

    public static void main(String[] args) {
        Dog d = new Dog("Tom");
        Dog d2 = new Dog("Jerry");

        System.out.println(d);
        System.out.println(d.name.equals(d2.name));
        System.out.println(d.hashCode());
    }
}
