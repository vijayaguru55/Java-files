/*
 * 85.Java Program to find the sum of each row and each column of a matrix
 */
public class Q85 {
        static void sumOfRowCol(int[][] n) {
            int row=0,col=0;
            for(int i=0;i<n.length;i++){
                for(int j=0;j<n.length;j++){
                    if(j<n[i].length)
                        row+=n[i][j];
                    if(j<n[i].length)
                        col+=n[j][i];
                }
                System.out.println("sum of row "+(i+1)+" is :"+row);
                System.out.println("sum of column "+(i+1)+" is :"+col);
                row=col=0;
            }

        }

        public static void main(String[] args) {
            int[][] m1 = {{1,2,2},{4,5,3},{3,2,3}};
            sumOfRowCol(m1);
        }
}
