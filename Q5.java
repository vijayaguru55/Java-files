/* 
 * 5) Write a program to print the following pattern based on the alphabet.
 *  Input: E
    Output:
    EEEEE
    DDDD
    CCC
    BB
    A

 */ 
public class Q5 {
    public static void getPattern(char c){
        for(int i=(c-64);i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(c);
            }
            c--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getPattern('Z');
    }
}
