package vertusa;

public class Inheritance {
    public static void main(String[] args) {
        Cal c1=new Cal();
        c1.sub(2,3);

        Add c=new Add();
        c.add(1,2);
        c.sub(1,2);

        Mul m=new Mul();
        m.add(1,2);
        m.sub(1,2);
        m.mul(1,2);
    }
}
class Cal {
   public void sub(int a,int b){
       System.out.println("sub :"+(a-b));
   }

}
class Add extends Cal{
    public void add(int a,int b){
        System.out.println("Adding :"+(a+b));
    }
}

class Mul extends Add{
    public void mul(int a,int b){
        System.out.println("Muling :"+(a*b));
    }
}


