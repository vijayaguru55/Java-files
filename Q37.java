/*
 * 37) Java Program to print the elements of an array present on odd position
 */
public class Q37 {
    //Arrays starting index is 0 , but we have even position consider index 0 is poosition 1
    
    public static void getElementsInOddPosition(int[] n){
        int l=n.length;

        for(int i=-0;i<l;i+=2){  //Index 0 is the 1st Odd posoiton 1
            System.out.print(n[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] n = {11,33,4,6,7789,0,65,3,2};
        getElementsInOddPosition(n);
    }
}
