import java.util.Arrays;
/*
 * 97.Java program to find a character in a given string using binary search.
 */
public class Q97 {
    static void binarySearch(String a,char target){
        char[] c=a.toCharArray();
        Arrays.sort(c);
        int i=0,j=c.length-1;
        while(i<=j){
            int mid=(i+j)/2;
    
            if(target<c[mid]){
                j=mid-1;
            }
            else if(target==c[mid]){
                System.out.println(target+" founded");
                return;
            }else{
                i=mid+1;
            }
        }

        System.out.println(target+ " not found.");
    }
    public static void main(String[] args) {
        String word = "Engineering";
        binarySearch(word, 'o');
        binarySearch(word, 'r');
        
    }
}
