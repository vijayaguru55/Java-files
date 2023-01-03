import java.util.Arrays;
/*
 * 63.Java Program to print the largest element and smallest element in an array
 */
public class Q63 {
    static void getMaxAndMin(int[] n){
       
        int largest =Integer.MIN_VALUE;
        int smallest = n[0];
        for(int i=0;i<n.length;i++){
            largest=n[i]>largest?n[i]:largest;
            smallest=n[i]<smallest?n[i]:smallest;
        }

        System.out.println("Largest element is :"+largest);
        System.out.println("Smallest element is :"+smallest);
    }

    static void getMaxAndMinBySort(int[] n){
        Arrays.sort(n);
        System.out.println("Largest element is :"+n[n.length-1]);
        System.out.println("Smallest element is :"+n[0]);
    }
    public static void main(String[] args) {
        int[] n = {2,3,12,34,5,6,6,768,9,9,0,-42};
        getMaxAndMin(n);
        getMaxAndMinBySort(n);
    }
}
