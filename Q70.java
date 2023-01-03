import java.util.Arrays;


/*
 * 70.Java Program to find the 2nd Largest Number in an Array
 */
public class Q70 {
    static int secondMaxByloop(int[] n){    //time O(n)

        int max=Integer.MIN_VALUE,sMax =Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(n[i]>=max){
                max=n[i];
            }
            else if(n[i]>sMax){
                sMax=n[i];
            }
        }
        return sMax;
        
    }

    static int secondMaxBySorted(int[] n){
        
        Arrays.sort(n);
        int i=n.length-1,smax=0,j=i-1;
        while(n[i]==n[j] && j>=0){
            smax=n[j--];
        }
        if(j>=0)
            smax=n[j];
        return smax;
    }

    public static void main(String[] args) {
        int[] n = {2,3,12,12,12,12,34,3,4,34,5,6,12};
        System.out.println(secondMaxByloop(n));
        System.out.println(secondMaxBySorted(n));
        
    }
}
