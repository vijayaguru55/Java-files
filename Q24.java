import java.util.Scanner;

/*
 * 24) Program to find the ASCII value of the Character
 */
public class Q24 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Character");
        char c =s.next().charAt(0);
        s.close();
        System.out.println("ASCII value for "+c+" is "+(int)c);
    }
}
