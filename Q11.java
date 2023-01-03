

/* 
 * 11) Java Program to left rotate the elements of a multidimensional array.
 */
public class Q11 {
    public static void rightRotate(int[][] n){
        int[][] a =new int[n.length][n[0].length];
        for(int i=0;i<a.length;i++){
            int k=0;
            for(int j=n[i].length-1;j>=0;j--){
                a[i][k++]=n[j][i];
            }
        }

        for(int i=0;i<n.length;i++){
            
            for(int j=0;j<n[i].length;j++){
                n[i][j]=a[i][j];
            }
        }
        
    }

    public static void leftRotate(int[][] n){
        int[][] a =new int[n.length][n[0].length];
        int c=0;
        for(int i=n.length-1;i>=0;i--){
            int k=0;
            for(int j=0;j<n[i].length;j++){
                a[c][k++]=n[j][i];
            }
            c++;
        }
        for(int i=0;i<n.length;i++){
            
            for(int j=0;j<n[i].length;j++){
                n[i][j]=a[i][j];
            }
        }
        
    }

    public static void main(String[] args) {
        int[][] n ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        leftRotate(n);
        for (int[] is : n) {
            for (int i=0;i<is.length;i++){
                System.out.print(" "+is[i]+" ");
            }
            System.out.println();
        }
    }
}
