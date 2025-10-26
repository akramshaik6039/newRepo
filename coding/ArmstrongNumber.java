package coding;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int xerox1=num;
        int xerox2=num;
        int numCount=0;

        int sum=0;
        while(xerox1>0){
            int rem=xerox1%10;
            numCount++;
            xerox1=xerox1/10;
        }

        while(xerox2>0){
            int rem=xerox2%10;
            int expo=1;
            for (int i=0;i<numCount;i++){
                expo=rem*expo;
            }

            sum=sum+expo;
            xerox2=xerox2/10;
        }
       if(sum==num){
           System.out.println(num+" is a Armstrong number");
       }
       else{
           System.out.println(num+" is not a Armstrong number");
       }

    }
}
