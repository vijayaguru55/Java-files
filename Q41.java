import java.util.Arrays;

/*
 * 41) Java Program to copy all elements of one array into another array
 */
public class Q41 {

    public static int[] copyAll(int[] a){
        int[] ar = new int[a.length];
        for(int i=0;i<ar.length;i++){
            ar[i]=a[i];
        }
       
        return ar;
    }
    public static void main(String[] args) {
        int[] n = {112,3,4,54,6,7,89,34,23,78};
        System.out.println("Original Array "+Arrays.toString(n));
        int[] m = copyAll(n);
        
        System.out.println("New Array      "+Arrays.toString(m));
    }
}
