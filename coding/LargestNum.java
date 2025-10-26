package coding;

public class LargestNum {
    public static void main(String[] args) {
        int [] arr={2,4,7,9};
        int num=arr[0];
        for(Integer i:arr){
            if(i>num){
                num=i;
            }
        }
        System.out.println("Largest Number :"+num);
    }
}
