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
        int sum=0;
        if(n<3){
            return n;
        }
        else{
            for(int i=n;i>=3;i--){
                sum+=((i-1)+(2*(i-2))+(3*(i-3)));
            }
        }
        return sum;
    }

public static void main(String args[]){
    System.out.println(fRecursive(7));
    System.out.println(fIterative(7));
}}