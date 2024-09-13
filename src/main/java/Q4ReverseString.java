// src/main/java/Q4ReverseString.java

public class Q4ReverseString {
    public static void main(String[] args) {
        reverse("test string");
    }
    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        // For Loop Version

        /*int len = s.length();
        String y="";
        for(int i =len-1;i>=0;i--){
            char x = s.charAt(i);
            y =y+x;
        }
        System.out.println(y);
        return "";*/

        //Recusrion Version

        int len = s.length();
        if(len<=0){
            return s;}
        
        else{
            
            return (reverse(s.substring(1, len))+(s.charAt(0)+""));}
    }
} 