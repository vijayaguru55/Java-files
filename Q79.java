/*
 * 79.Java Program to determine whether a given matrix is an identity matrix
 */
public class Q79 {

    static void isIdentityMatrix(int[][] m){

        if(m.length!=m[0].length){
            System.out.println("Matrix must be N*N");
            return;
        }
        int pivot=1;
        for(int i=0;i<m.length;i++){
            for(int j=i;j<m.length;j++){
                if(m[i][j]!=1  && m[j][i]!=0){
                    pivot=0;
                    break;
                }
            }

        }
        if(pivot==1)
            System.out.println("Given matrix is an identity matrix");
        else
            System.out.println("Given matrix is not an identity matrix");
    }
    public static void main(String[] args) {
        int[][] m1 = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        int[][] m2 = {{0,0,1},{0,1,0},{1,0,0}};
        int[][] m3 = {{0,0,1},{1,1,0},{0,0,0}};
        isIdentityMatrix(m1);
        isIdentityMatrix(m2);
        isIdentityMatrix(m3);
    }
}
