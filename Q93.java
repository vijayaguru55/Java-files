/*
 * 93.Java Program to sort the characters in a word in descending using recursion.
 */
public class Q93 {
    static String sortByrecurion(String s){
        StringBuilder str = new StringBuilder(s);
        char[] characters =s.toCharArray();
        char character =characters[0];
        
        String sorted = "";
        int index =0;
        for(int i=1;i<characters.length;i++){
            String char1 = String.valueOf(character), char2 = String.valueOf(characters[i]);
            if(char1.compareTo(char2)<0){
                character=characters[i];
                index=i;
            }
        }
        sorted+=character;

        if(characters[0]!=character){
            str.setCharAt(0, character);
            str.setCharAt(index, characters[0]);
        }
        if(characters.length>=2){
            sorted+=sortByrecurion(str.substring(1));
            
        }
        return sorted;
    }
    public static void main(String[] args) {
        String word = "Software";
        System.out.println(sortByrecurion(word));
       
    }
}
