/*
 * 81.Java Program to determine whether two matrices are equal
 */
public class Q81 {
    static void isEqual(int[][] a, int[][] b){
        if(a.length!=b.length || a[0].length!=b[0].length){
            System.out.println("Matrices are not equal");
            return;
        }
        int i=0,j=a.length-1;
        boolean flag=true;
        outer:
        while(i<=j){
            for(int k=i,l=j;k<=a.length && l>=0;k++,l--){
                if(a[i][k]!=b[i][k]){
                    flag=false;
                    break outer;
                }
                if(a[j][l]!=b[j][l]){
                    flag=false;
                    break outer;
                }
            }
            i++;j--;
        }

        if(flag)
            System.out.println("Matrices are Equal..");
        else
            System.out.println("Matrices are not Equal..");
    }
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3,2},{4,5,6,3},{3,2,1,4},{1,2,3,4}};
        int[][] m2 = {{7,2,3},{4,5,6},{3,2,1}};
        int[][] m3 = {{1,2,3,2},{4,5,6,3},{3,2,1,4},{1,2,3,4}};
        int[][] m4 = {{7,2,3},{4,5,6},{3,2,1}};
        isEqual(m1, m3);
        isEqual(m2, m4);
    }
}
