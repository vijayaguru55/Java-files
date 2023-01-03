import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
 * 9) Given two sorted arrays, merge them such that the elements are not repeated
        Example 1:
        Input: Array 1: 2,4,5,6,7,9,10,13
                 Array 2: 2,3,4,5,6,7,8,9,11,15
        Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15

 */

public class Q9 {
    public static int[] merge(int[] a, int[] b){
        Set<Integer> s = new HashSet<>();
        int i=0;

        while(i<a.length|| i<b.length){
            if(i<a.length)s.add(a[i]);
            if(i<b.length)s.add(b[i]);
            i++;
        }
        int[] mA = new int[s.size()];
        Iterator<Integer> it = s.iterator();
        i=0;
        while(it.hasNext()){
            mA[i++]=(int)it.next();
        }
        Arrays.sort(mA);
        return mA;
        

    }

    public static void main(String[] args) {
        int[] a = {2,4,5,6,7,9,10,13};
        int[] b ={2,3,4,5,6,7,8,9,11,15,24,0};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
