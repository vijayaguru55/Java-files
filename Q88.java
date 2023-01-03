import java.util.Arrays;
import java.util.StringTokenizer;


/*
 * 88.Java Program to convert a sentence/paragraph to word(String) array with using string function.
 */
public class Q88 {

    static String[] getWords(String s){
        
        StringTokenizer tokenizer = new StringTokenizer(s);
        int i=0;
        String[] worsds = new String[tokenizer.countTokens()];
        while(tokenizer.hasMoreTokens()){
            worsds[i++]=tokenizer.nextToken();
        }   

        return worsds;
    }
    public static void main(String[] args) {
        String s ="Hii this is clever coder";
        String[] worsds = s.split("\\+");
        String[] worsds1 = s.split(" ");
        String[] worsds3 = getWords(s);
        System.out.println(Arrays.toString(worsds));
        System.out.println(Arrays.toString(worsds1));
        System.out.println(Arrays.toString(worsds3));
    }
}
