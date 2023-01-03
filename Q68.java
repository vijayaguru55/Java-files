/*
 * 68.Java Program to print the sum of all the items of the array
 */
public class Q68 {
    static int sumOfArray(int[] n){ //time O(n)
        int sum =0;
        for (int i : n) {
            sum+=i;
        }
        return sum;
    }

    static int sumOfArrays(int[] n){    //time O(n/2)
        int sum=0,i=0,j=n.length-1;
        while( i<j){
            sum+=(n[i++]+n[j--]);
        }
        if(i==j)
            sum+=n[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] n = {12,3,9,4,5,6,23,56};
        System.out.println(sumOfArray(n));
        System.out.println(sumOfArrays(n));
    }
}
