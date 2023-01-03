/*
 * 45) Java Program to print the sum of all the items of the array
 */
public class Q45 {

    public static int getSum(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++)
            sum+=n[i];
        
        return sum;
    }
    public static void main(String[] args) {
        int[] n =  {112,3,4,54,6,7,89,34,23,78};
        int sum = getSum(n);
        System.out.println( "Sum of All items In array is "+sum);
    }
}
