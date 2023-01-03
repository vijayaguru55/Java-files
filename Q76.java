import java.util.Arrays;

/*
 * 76.Java Program to display the transpose matrix
 */
public class Q76 {
    static void transpose(int[][] n){
        
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                int t=n[i][j];
                n[i][j]=n[j][i];
                n[j][i]=t;
            }
           
        }

        
    }

    public static void main(String[] args) {
        int[][] n = {{1,2,3},{4,5,2},{2,3,4}};
       
        for (int[] is :n) {
            System.out.println(Arrays.toString(is));
        }
    }
}
