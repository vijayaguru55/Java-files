/*
 * 51) Write a program to display the number in reverse order without use of String functions.
 *  Eg 1:  Input: 12345
    Output :The number in reverse order is : 54321
 */
public class Q51 {
    public static int reverse(int n){
        int a, b=0;
        while(n>0){
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }

        return b;
    }
    public static void main(String[] args) {
        int n = 2545;
        
        System.out.println(reverse(n));
    }
}
