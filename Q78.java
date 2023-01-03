/*
 * 78.Java Program to subtract the two matrices
 */
public class Q78 {

    static int[][] subtractMatrix(int[][] n,int[][] m){      //time O(n*n)
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j]-=m[i][j];
            }
        }
        return n;
    }

    
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3},{4,5,6},{3,2,1}};
        int[][] m2 = {{7,2,3},{4,5,6},{3,2,1}};
        int[][] m1m2 = subtractMatrix(m1, m2);

        for (int[] is : m1m2) {
            int[] i = is;
            for (int js : i) {
                System.out.print(js+" ");
            }
            System.out.println();
        }
    }
}
