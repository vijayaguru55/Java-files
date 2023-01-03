/*
 * 99.Java Program to convert all small letter to capital letter without using special functions.
 */
public class Q99 {
    static String toUppercase(String word){
        String capital ="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=97 && word.charAt(i)<=122){
                capital+=(char)(word.charAt(i)+65-97);
            }else{
                capital+=word.charAt(i);
            }
        }
       
        return capital;
    }
    public static void main(String[] args) {
        String word = "engineer";
        System.out.println(toUppercase(word));
    }
}
