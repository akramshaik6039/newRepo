package package1;

public class Parent {
    public void add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    private void sub(int a,int b){
        int sum=a-b;
        System.out.println(sum);
    }
    protected void mul(int a,int b){
        int sum=a*b;
        System.out.println(sum);
    }

//    public static class Child extends Parent{
//        public static void main(String[] args) {
//            Parent p=new Parent();
//            p.add(1,2);
//            Child c=new Child();
//            c.mul(3,4);
//        }
//    }
}
