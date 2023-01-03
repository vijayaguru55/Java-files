/*
 * 80.Java Program to determine whether a given matrix is a sparse matrix 
 */

public class Q80 {
    static void isSparseMatrix(int[][] n){
        int zeros =0;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                if(n[i][j]==0)
                    zeros++;
                if(i!=j){
                    if(n[j][i]==0)
                    zeros++;
                }
            }
        }
        int size = n.length*n[0].length;
        if(zeros>(size/2))
            System.out.println("Given matrix is a sparse matrix.");
        else
        System.out.println("Given matrix is not a sparse matrix.");

    }

    public static void main(String[] args) {
        int[][] m = {{0,0,3},{0,4,5},{6,0,0}};
        int[][] m1 = {{0,0,3,0},{0,4,5,1},{6,0,0,3},{1,2,3,0}};
        isSparseMatrix(m);
        isSparseMatrix(m1);
    }
}
