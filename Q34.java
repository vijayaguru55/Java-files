/*
 * 34) Program to Calculate the Sum of Natural Numbers and find the largest digit of the sum
 */
public class Q34 {

    public static int largestDigitOfSum(int n){
        String s = Integer.toString(n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int m = Integer.parseInt(Character.toString(s.charAt(i)) );
            if(m>max)
                max=m;
        }

        return max;
    }
    public static int sumOfnatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    } 
    public static void main(String[] args) {
         int n = 100;
        System.out.println(largestDigitOfSum(sumOfnatural(n)));
    }
}
