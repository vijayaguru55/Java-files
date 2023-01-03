import java.util.Arrays;

/*
 * 66.Java Program to left rotate the elements of an array
 */
public class Q66 {
    static void lerftRotate(Object[]n, int times){  //time O(k*(n-1))
       while(times>0){
        Object firstElement = n[0];
        for(int i=0;i<n.length-1;i++)
            n[i]=n[i+1];
        
        n[n.length-1]=firstElement;
        times--;
        }
    }

    static void leftRotateByRevese(Object[] n,int times){
        int l=n.length, k=times;
        //Reverse last l-k element
        for(int i=k,j=l-1;i<j;i++,j--){
            Object temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        //Reverse the 1st k elements
        for(int i=0,j=k-1;i<j;i++,j--){
            Object temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        //Reversing the whole elements
        for(int i=0,j=l-1;i<j;i++,j--){
            Object temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }


    }
    public static void main(String[] args) {
        Object[] n ={"Vijay","Vijay","Guru","Vijayaguru","Vijay","Guru","Kumar","Krish"};
        Object[] nn = {2,3,12,34,5,6,12};
        lerftRotate(nn, 3);
        leftRotateByRevese(n,3 );
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(nn));
    }
}
