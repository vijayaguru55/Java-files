import java.util.Arrays;

/*
 * 69.Java Program to rotate the elements of an array in the right direction
 */

public class Q69 {
    static void rotateRightByloop(Object[] n, int times ){
        while(times>0){
            Object first = n[n.length-1];
            for(int i=n.length-1;i>0;i--)
                n[i]=n[i-1];
            n[0]=first;
            times--;
        }
    }

    static void rightRotateByReverse(Object[] n, int times){
        int l=n.length;
        int k=times%l;
        //Reverse the last l-k numbers
        for(int i=l-k,j=l-1;i<j;i++,j--){
            Object temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        //Reverse the 1st l-k elements
        for(int i=0,j=l-k-1;i<j;i++,j--){
            Object temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
        //Reverse the total elements
        for(int i=0,j=l-1;i<j;i++,j--){
            Object temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
    }
    public static void main(String[] args) {
        Object[] n ={"Vijay","Guru","Vijayaguru","Guru","Kumar","Krish"};
        Object[] nn = {2,3,12,34,5,6,12};
        rightRotateByReverse(nn, 3);
        rotateRightByloop(n, 1);
        System.out.println(Arrays.toString(nn));
        System.out.println(Arrays.toString(n));
    }
}
