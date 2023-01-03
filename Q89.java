import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 89.Java Program to convert a sentence/paragraph to word(String) array without using string function.
 */
public class Q89 {
    static String[] getWords(String s){
        List<String> words = new ArrayList<>(); 
        int index =0;

        String word  ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }else{
                words.add(word);
                word="";
            }

        }
        words.add(word);
        String[] wordsOfS=new String[words.size()];
        for (String string : words) {
            wordsOfS[index++]=string;
        }
        
        return wordsOfS;
    }
    public static void main(String[] args) {
        String word = "this is from console";
        String[] words = getWords(word);
        System.out.println(Arrays.toString(words));
    }
}
