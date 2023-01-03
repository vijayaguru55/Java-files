/*
 * 95.Java Program to find the given two strings are palindrome.
 */
public class Q95 {
    static boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }

    static boolean isPalindromeByreverse(String a){
        int index=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(index++)!=a.charAt(i))
                return false;
        }
        return true;
    }

    
    static void isPalindromeWords(String a,String b){
        boolean b1 =isPalindrome(a),b2=isPalindromeByreverse(b);
       if(b1 && b2){
        System.out.println("Both words are palindrome.");
        return;
       }else if(b1){
        System.out.println(b+" is not a palindrome");
       }else{
        System.out.println(a+" is not a palindrome");
       }
    }

    public static void main(String[] args) {
        String a ="anna",b="draward";
        isPalindromeWords(a, b);
    }
}
