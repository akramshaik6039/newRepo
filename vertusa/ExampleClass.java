package vertusa;

public class ExampleClass {
    String name;
   static String clg="Revature";
    ExampleClass(String name){
        this.name=name;
    }
    ExampleClass(ExampleClass e){
        this.name=e.name;
    }
    void display(){
        System.out.println(name+""+clg);
    }
    public static void main(String[] args) {
        ExampleClass obj=new ExampleClass("Akram");
        obj.display();
        ExampleClass obj2=new ExampleClass(obj);
        ExampleClass.clg="Hms";
        obj2.display();
    }
}
