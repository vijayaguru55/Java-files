/*
 * 98.Java Program to print the equivalent Capital letter of a given small letter in Alphabets.
 */
public class Q98 {
    static char getCapital(char character){
        if(character<97 || character>122){
            System.out.println("given character is not a alphabate/not a small letter");
            return character;
        }
        character =(char)((int)character+65-97);
        return character;
    }
   

    public static void main(String[] args) {
        char character ='z';
        System.out.println(getCapital(character));
       
    }
}
