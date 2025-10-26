public class LargestNum {
    public static void main(String[] args) {
        int [] numbers={3,7,9};
        int sam=numbers[0];
        for(int n:numbers){
            if(n>sam){
                sam=n;
            }
        }
        System.out.println("Largest Number is :"+sam);
    }
}
