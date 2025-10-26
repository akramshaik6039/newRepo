package vertusa;

public class Builder {
    public static void main(String[] args) {
        StringBuilder br=new StringBuilder("Hello");
        br.append(" World");
        System.out.println(br);
        br.insert(5," java");
        System.out.println(br);
        br.delete(5,10);
        System.out.println(br);

        StringBuilder br1=new StringBuilder("Hello");
        br1.append(" World");
        System.out.println(br1);
        br1.insert(5," java");
        System.out.println(br1);
        br1.delete(5,10);
        System.out.println(br1);
    }
}
