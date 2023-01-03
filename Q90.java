import java.util.ArrayList;
import java.util.List;

/*
 * 90.Java Program to sort the words in ascending
 */
public class Q90 {
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


    static void sortByascending(String s){
        String[] words = getWords(s);
        int i=0;
		int j=i+1;
		while(i<words.length-1) {
			if(words[i].compareTo(words[j])>0) {
				String word = words[i];
				words[i] = words[j];
				words[j] =word;
			}
			if(j==words.length-1) {
				i++;
				j=i+1;
			}else {
				j++;
			}
		}
       
        for (String string : words) {
            System.out.print(string+" ");
        }
       
       
    }
    public static void main(String[] args) {
        String sentence = "Hii this is from console";
        sortByascending(sentence);
      
    }
}
