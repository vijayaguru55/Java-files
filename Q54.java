import java.util.Arrays;
/*
 * 54) Write a program to sort the elements in odd positions in descending order and
        elements in ascending order.
        Eg 1:  Input:  13,2 4,15,12,10,5
                 Output: 13,2,12,10,5,15,4
        Eg 2:  Input: 1,2,3,4,5,6,7,8,9
                 Output: 9,2,7,4,5,6,3,8,1
 */
public class Q54 {
    public static void sort(int[] n, int s, int e,boolean asc){
        if(s>=e){
            return;
        }
        int start=s,end=e, mid=(s+e)/2;int pivot=n[mid];
        while(start<=end){
            while(asc?n[start]<pivot:n[start]>pivot){
                start++;
            }
            while(asc?n[end]>pivot:n[end]<pivot){
                end--;
            }
            if(start<=end){
                int temp=n[start];
                n[start]=n[end];
                n[end]=temp;
                start++;
                end--;
            }
        }
        sort(n, s, end, asc);
        sort(n, start, e , asc);
    }

    public static void sortByLogic(int[] n){
       
        int[] even = new int[n.length/2];
        int[] odd =new int[n.length-even.length];
        int c1=0,c2=0;
        for(int i=0;i<n.length;i++){
            if(i%2==0)
                odd[c1++]=n[i];
            else
                even[c2++]=n[i];
        }
        sort(odd, 0, odd.length-1, false);
        sort(even, 0, even.length-1, true);
        c1=0;c2=0;
        for(int i=0;i<n.length;i++){
            if(i%2==0)
                n[i]=odd[c1++];
            else
                n[i]=even[c2++];
        }
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9};
        sortByLogic(n);
        System.out.println(Arrays.toString(n));
    }
}
