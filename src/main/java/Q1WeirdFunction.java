// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if(n<3){
            return n;
        }
        else if(n>=3){
            int x = fRecursive(n-1)+(2*fRecursive(n-2))+(3*fRecursive(n-3));
            return x;
        }
        return 0;
    }

    public static int fIterative(int n) {
        if(n<3){
            return n;
        }
        else{
            int x = 0;
        }
        return 0;
    }

public static void main(String args[]){
    System.out.println(fRecursive(4));
}}