/*
 * 74.Java Program to find the product of two matrices
 */

public class Q74 {
    static int[][] getProduct(int[][] a, int[][] b){     //time O(n*n^2)
        int colA = a[0].length, colB=b[0].length,rowA=a.length,rowB=b.length;
        
        if(colA!=rowB){
            System.out.println("Matrix cannot be multiplied..");
            return null;
        }

        int[][] product = new int[a.length][a[0].length];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                for(int k=0;k<rowB;k++){
                    product[i][j]+= a[i][k]*b[k][j];
                }
            }
        }

        return product;
    }

    public static void main(String[] args) {
        int[][] m1 = {{1,2,3},{4,5,6},{3,2,1}};
        int[][] m2 = {{7,2,3},{4,5,6},{3,2,1}};
        int[][] m1m2 = getProduct(m1, m2);

        for (int[] is : m1m2) {
            int[] i = is;
            for (int js : i) {
                System.out.print(js+" ");
            }
            System.out.println();
        }
    }
}
