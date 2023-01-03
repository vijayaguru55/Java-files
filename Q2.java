

/* 
 * 2) Write a program to print a letters from the user input character to 'Z' without using strings.
 */

public class Q2 {
    public static void  alphabets(char c){
        for(int i=c;i<='Z';i++){
            System.out.print((char)i);
        }
    }

    public static void main(String[] args) {
        alphabets('A');       
    }
}
