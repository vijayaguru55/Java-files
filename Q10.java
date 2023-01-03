import java.util.Arrays;

/* 
 *Alternate sorting: Given an array of integers, rearrange the array in such a way that
  the first element is first maximum and second element is first minimum.
        Example: Input : {1, 2, 3, 4, 5, 6, 7}
        Output: {7, 1, 6, 2, 5, 3, 4}
 */
public class Q10 {
    public static int[] rearrange(int[] a){
        Arrays.sort(a);
        int i=0, j=a.length-1,k=0;
        int[] ar = new int[a.length];
        while(j>=i){
            if(k<a.length){
                ar[k++]=a[j--];
                if(k<a.length)ar[k++]=a[i++];
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5,12,2,4,5,23,43,67, 6, 7};
        a = rearrange(a);
        System.out.println(Arrays.toString(a));
    }
}
