
import java.util.Arrays;
/*
 * 64.Java Program to copy all elements of one array into another array
 */
public class Q64 {

    static Object[] copyAll(Object[] n){
        Object[] copy =new Object[n.length];
        for(int i=0;i<n.length;i++)
            copy[i]=n[i];
            
        return copy;
    }

    static Object[] copyByInitializing (Object[] n){
        Object[] copy = n;
        return copy;
    }
    public static void main(String[] args) {
        Object[] n = {2,3,12,34,5,6,6,768,9,9,0,-42};
        System.out.println(Arrays.toString(n=copyAll(n)));
        System.out.println(Arrays.toString(copyByInitializing(n)));
    }

}
