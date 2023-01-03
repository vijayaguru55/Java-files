
import java.util.*;


/*
 * 61.Java Program to print the elements of an array in reverse order
 */
public class Q61 {
    static void reverseByloop(Object[] n){
        if(n.length<2)
            return;
        for(int i=0;i<n.length/2;i++){
            Object val = n[i];
            n[i]=n[n.length-i-1];
            n[n.length-i-1]=val;
        }
    
    }

    static void revByRecursion(Object[] n,int s,int e){
        if(s<e)
            revByRecursion(n, s+1, e-1);
        Object t= n[s];
        n[s]=n[e];
        n[e]=t;
     }

    
    public static void main(String[] args) {
        Object[] numbers = {2,3,4,5,65,43,2,12,34,78,9095,34};
        Object[] string ={"vijay","guru", "intern", "state"};
        System.out.println("Reverse by loop:");
        revByRecursion(string,0,string.length-1);
        //reverseByloop(numbers);
        revByRecursion(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(string));
        System.out.println(Arrays.toString(numbers));
        

    }
}
