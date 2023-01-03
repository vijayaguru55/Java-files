import java.util.Arrays;

/*
 * 71.Java Program to find the 2nd Smallest Number in an Array
 */

public class Q71 {
    static int secondMinByloop(int[] n){    //time O(n)

        int min=Integer.MAX_VALUE,sMin =Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(n[i]<min ){
                sMin=min;
                min=n[i];   
            }
            else if(n[i]<sMin && n[i]!=min){
                sMin=n[i];
            }        
        }
        return sMin;
        
    }

    static int secondMinBySorted(int[] n){
        
        Arrays.sort(n);
        int i=0,sMin=0,j=i+1;
        while(n[i]==n[j] && j<n.length){
            sMin=n[j++];
        }
        sMin=n[j];
        return sMin;
    }

    public static void main(String[] args) {
        int[] n = {2,3,12,12,12,-4,12,34,3,1,-94,34,5,6,12};

        System.out.println(secondMinBySorted(n));
    }
}
