/*
 * 28) Program to Check Whether a Number is Even or Odd
 */
public class Q28 {
    public static String findOddorEven(int n){
        if(n%2==0)
            return "Even";
        return "Odd";
    }

    public static void main(String[] args) {
        int  i =1549;
        System.out.println(findOddorEven(i));
    }
}
