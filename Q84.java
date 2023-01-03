/*
 * 84.Java Program to find the frequency of odd & even numbers in the given matrix
 */
public class Q84 {
    static void getFreqOf_odd_and_even(int[][] n){
        int even=0,odd=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(n[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Odd number frequency is :"+odd);
        System.out.println("Even number frequency is :"+even);
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3,2,1},{2,4,5,6,3},{6,3,2,1,4},{6,1,2,3,4},{2,4,5,5,6}};
        getFreqOf_odd_and_even(m);
    }
}
