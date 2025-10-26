public class Grades {
    public static void main(String[] args) {
        int total=10;

        if(total>80){
            System.out.println("Excellent");
        }
        else if(total>=70 && total<=80 ){
            System.out.println("Very Good");
        }
        else if(total>40 && total<69){
            System.out.println("good");
        }
        else{
            System.out.println("Failed");
        }
    }
}
