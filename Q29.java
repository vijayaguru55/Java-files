/*
 * 29) Program to Check Whether a Character is a Vowel or Consonant
 */
public class Q29 {
    static boolean isVowel(char c){
        if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u')
            return false;
            
        return true;
    }

    public static String isVowelOrConsonent(char c){
        c = Character.toLowerCase(c);
        if(!(c>='a' && c<='z'))
            return "Alphabatic Characters only";
        if(isVowel(c))
            return "Vowel";
        return "Consonant";
    }
    public static void main(String[] args) {
        char c = 'e';
        System.out.println(isVowelOrConsonent(c));
       
    }
}
