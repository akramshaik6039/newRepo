package vertusa;

import java.util.Arrays;

public class CallByReference {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int []arr2=arr;
        arr2[0]=22;
        System.out.println(arr2[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
