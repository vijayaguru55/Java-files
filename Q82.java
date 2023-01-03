/*
 * 82.Java Program to display the lower triangular matrix
 */
public class Q82 {

    static void getLowerTriangle(int[][] n){
        
        if(n.length!=n[0].length){
            System.out.println("Matrix must be N*N matrix");
        }else{
            for(int i=0;i<n.length;i++){
                for(int j=0;j<n[i].length;j++){
                    if(j>i)
                        System.out.print(" "+0);
                    else
                        System.out.print(" "+n[i][j]);
                }
                System.out.println();
            }
        }
    }

    static void getLowTri(int[][] n){
        int l =n.length/2;
        for(int i=0;i<=l;i++){
            for(int j=n.length-1;j>=i+1;j--){
                n[i][j]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3,2},{4,5,6,3},{3,2,1,4},{1,2,3,4}};
       getLowerTriangle(m1);
       System.out.println("----------------------------");
       getLowTri(m1);
       for (int[] is : m1) {
            for (int i: is) {
                System.out.print(" "+i);
            }
            System.out.println();
       }
    }
}
