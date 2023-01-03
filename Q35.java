/*
 * 35) Program to Find Factorial of a Number and the facorial number's sum of digits.

 */
public class Q35 {
    //Method for getting fatorials 
    public static int getFact(int n) {
        if(n>=1){
            return n * getFact(n-1);
        }
        return 1;
    }

    public static int getSumOffactorialDigits(int n){
        int facorial = getFact(n);
        System.out.println("factorial of the given number "+n+" is -"+facorial);
        String s = String.valueOf(facorial);
        int sum=0;
        for(int i =0;i<s.length();i++)
            sum+=Integer.parseInt(Character.toString(s.charAt(i)));
        
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of the digits are "+getSumOffactorialDigits(6));
    }
}
