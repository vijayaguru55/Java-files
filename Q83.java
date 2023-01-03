/*
 * 83.Java Program to display the upper triangular matrix
 */
public class Q83 {
    static void getUpperrTriangle(int[][] n){
        
        if(n.length!=n[0].length){
            System.out.println("Matrix must be N*N matrix");
        }else{
            for(int i=0;i<n.length;i++){
                for(int j=0;j<n[i].length;j++){
                    if(i>j)
                        System.out.print(" "+0);
                    else
                        System.out.print(" "+n[i][j]);
                }
                System.out.println();
            }
        }
    }

    static void getUpperTri(int[][] n){
        int l =n.length/2;
        for(int i=n.length-1;i>=l-1;i--){
            for(int j=0;j<=i-1;j++){
                n[i][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] m1 = {{1,2,3,2,1},{2,4,5,6,3},{6,3,2,1,4},{6,1,2,3,4},{2,4,5,5,6}};
       getUpperrTriangle(m1);
       System.out.println("----------------------------");
        getUpperTri(m1);
       for (int[] is : m1) {
            for (int i: is) {
                System.out.print(" "+i);
            }
            System.out.println();
       }
    }

}
