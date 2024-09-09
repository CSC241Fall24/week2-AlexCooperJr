// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

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
        
        String rString="";
        int len = s.length();
        String newS="";
        if(len>0){
            System.out.print(s.charAt(len-1));
            rString+=s.charAt(len-1);
    
            for(int i =0;i<len-1;i++){
                newS+=s.charAt(i);
            }
            reverse(newS);}
        return rString;
    }


public static void main(String args[]){
    reverse("Alex");
}}