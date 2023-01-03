/* 
 * 1) Write a single program to generate a multiplicaiton and subtraction table for a given number.
 */

public class Q1 {
    public static void multiplicaitonAndSubtraction(int n){
            System.out.println(" Multiplication     Subtraction");
        for(int i=1;i<=10;i++){
            System.out.print(n+" * "+i+" = "+n*i+"      "+n+" - "+i+" = "+(n-i)+"\n");
        }
    }
    public static void main(String[] args) {
        multiplicaitonAndSubtraction(3);
    }
}
