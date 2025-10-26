package vertusa;

interface A{
    void add();

}
interface B extends A{
    void sub();
}


public class Interfaces implements B{
    public void add(){
        System.out.println("add");
    }
    public void sub(){
        System.out.println("sub");
    }
    public static void main(String[] args) {
        Interfaces obj=new Interfaces();
        obj.add();
        obj.sub();
    }
}
