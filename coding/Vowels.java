package coding;

public class Vowels {
    public static void main(String[] args) {
        String str="hello";
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Count of Vowels :"+vowels);
        System.out.println("Count of Consonents :"+consonants);
    }
}
