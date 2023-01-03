/*
 * 33) Program to Check Whether a Character is an Alphabet or not
 */
public class Q33 {
    public static String isAlpha(char c){
        if((c>='a' && c<='z')||(c>='A'&&c<='Z')){
            return c+" is an Alphabet";
        }

        return c+" is not an Alphabet";
    }

    public static void main(String[] args) {
         char c ='5', d='a', e= 'Z';
         System.out.println(isAlpha(c));
         System.out.println(isAlpha(d));
         System.out.println(isAlpha(e));
    }
}
