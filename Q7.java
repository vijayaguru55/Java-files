/* 
 * 7) Write a program to print the following output for the given input. You can assume the
      string is of odd length
      Eg 1:  Input: 12345
              Output:
                    1       1
                      2   2
                        3
                      4   4
                    5        5  
      
 */

public class Q7 {
    public static void xPattern(String s){
        if(s.length()%2==0){
            System.out.println("String length must be an odd ");
            return;
        }
            for(int i=0;i<s.length();i++){
                for(int j=0;j<s.length();j++){
                    if(i==j || j==s.length()-1-i){
                        System.out.print(s.charAt(i));
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        
       
    }

    public static void main(String[] args) {
        String s = "12345";
        xPattern(s);
    }
}
