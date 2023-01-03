/*
 * 62.Java Program to print the elements of an array present on even position and odd positions
 */
public class Q62 {
    static void getOddOrEven(int[] n,int position) {
        position=(position%2==0?1:0);
        //Consider index 0 as a 1st position
        String pos =position==0?"Odd ":"Even ";
        System.out.print(pos+"Position Elements are : ");
        for(int i=position;i<n.length;i+=2){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n = {2,3,12,34,5,6,6,768,9,9,0};
        int position = 23;//--->odd;
        getOddOrEven(n, position);
        position=40;//-->even
        getOddOrEven(n, position);
        
    }
}
