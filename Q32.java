/*
 * 32) Program to Check Whether a Number is Positive or Negative
 */
public class Q32 {
    public static String isPositiveornegative(int n){
        if(n<0){
            return "Negative";
        }else if(n>0){
            return "Positive";
        }
        return "0 is Neither Positive nor negative";
    }

    public static void main(String[] args) {
         int n =-9;
         System.out.println(isPositiveornegative(n));
    }
}
