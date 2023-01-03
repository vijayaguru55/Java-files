/* 
 * write a program to find the difference between the given number and it's reverse number.
 */

public class Q3 {
    //Method to reverse the given Number.
    static int getRev(int n){
        int a,b=0;
        while(n>0){
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }

        return b;
    }

    //Method to get difference between the given number and its reverse number
    public static int getDiff(int n){
        return n-getRev(n);
    }

    public static void main(String[] args) {
         System.out.println(getDiff(12345));
    }
}
