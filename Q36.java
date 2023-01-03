/*
 * 36) Java Program to print the elements of an array present on even position
 */
public class Q36 {
    //Arrays starting index is 0 , but we have even position consider index 0 is poosition 1
    
    public static void getElementsInEvenPosition(int[] n){
        int l=n.length;

        for(int i=1;i<l;i+=2){  //Index 1 is the 1st even posoiton 2
            System.out.print(n[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] n = {112,3,4,54,6,7,89,34,23,78};
        getElementsInEvenPosition(n);
    }
}
