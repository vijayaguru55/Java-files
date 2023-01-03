

/*
 * 75.Print Odd and Even Number from an Array
 */
public class Q75 {
    static void getOddAndEvenByloop(int[] n){
        StringBuilder odd =new StringBuilder();
        StringBuilder even =new StringBuilder();
        for (int i : n) {
            if(i%2 ==0){
                even.append(i+" ");
            }else{
                odd.append(i+" ");
            }
        }

        System.out.println("Odd numbers are : "+odd);
        System.out.println("Even numbers are : "+even);
    }

    
    public static void main(String[] args) {
        int[] n = {2,3,12,12,12,-4,12,34,3,1,-94,34,5,6,12};
        getOddAndEvenByloop(n);
    }
}
