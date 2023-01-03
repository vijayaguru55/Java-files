import java.util.Arrays;

/*
 * 87.Java Program to convert char array to string without using toString() method
 */
public class Q87 {
    static String getString(char[] c){
        String word = "";
        for (char d : c) {
            word+=d;
        }
        return word;
    }
    static String getStringByrecursion(char[] c){
        String word="";
        int i=0,j=c.length,mid=(c.length)/2;
        if(j==1)
            return word+=c[i];
        
        String left = getString(Arrays.copyOfRange(c, i, mid));
        String right = getString(Arrays.copyOfRange(c, mid, j));
        word+=left;
        word+=right;
        return word;
    }

    public static void main(String[] args) {
        char[] c = {'t','h','i','s',' ','i','s',' ','f','r','o','m',' ','c','o','n','s','o','l','e'};
        String word = getStringByrecursion(c);
        System.out.println(word);
    }
}
