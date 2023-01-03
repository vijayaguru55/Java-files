import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * 92.Java Program to sort the words in ascending using recursion.
 */
public class Q92 {static String[] getWords(String s){
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

    static String sortByRecursion(String[] s){
        String sorted="";
        String word = s[0];
        int index=0;
        for(int i=1;i<s.length;i++){
            if(word.compareTo(s[i])>0){
                word=s[i];
                index=i;
            }
        }
        sorted+=word+" ";
        if(word!=s[0]){
            String str = s[0];
            s[0]=word;
            s[index]=str;
        }
        if(s.length>=2){
            sorted+=sortByRecursion(Arrays.copyOfRange(s, 1, s.length))+" ";
        }
        return sorted;

    }
    public static void main(String[] args) {
        String sentence = "Hii this is from console terminal";
        String[] words = getWords(sentence);
        System.out.println(sortByRecursion(words));
    }
}
