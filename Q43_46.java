import java.util.Arrays;


/*
 * 43) Java Program to left rotate the elements of an array
 * 46) Java Program to rotate the elements of an array in the right direction
 */
public class Q43_46 {
    public static int[] leftRotateAnArray(int[] n, int position){
        int l=n.length;
        int k=position;
        //Reverse the last k numbers
        for(int i=k,j=l-1;i<j;i++,j--){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        //Reverse the 1st l-k elements
        for(int i=0,j=k-1;i<j;i++,j--){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
        //Reverse the total elements
        for(int i=0,j=l-1;i<j;i++,j--){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
        return n;
        
    }

    public static int[] rightRotateAnArray(int[] n, int position){
        
        int l=n.length;
        int k=position%l;
        //Reverse the last l-k numbers
        for(int i=l-k,j=l-1;i<j;i++,j--){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        //Reverse the 1st l-k elements
        for(int i=0,j=l-k-1;i<j;i++,j--){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
        //Reverse the total elements
        for(int i=0,j=l-1;i<j;i++,j--){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
        return n;

    }
    public static void main(String[] args) {
        int n = 3;
        int[] a = {1,2,3,4,5,6,7};
        
        //System.out.println(Arrays.toString(leftRotateAnArray(a, n)));
        System.out.println(Arrays.toString(rightRotateAnArray(a, n)));
       
       
    }
}
