/*
 * 57) Write a program to print the following output for the given input. You can assume
        the string is of odd length
        Eg 1:  Input: 12345
                Output:
        1       5
          2   4
            3
          2   4
        1        5

 */
public class Q57 {
    static void getPattern(String s){
        int len= s.length();
		for (int i = 0; i < len; i++) {
			int j =len -1-i;
			for(int k =0;k<len;k++) {	
				if(k==i || k==j)
					System.out.print(s.charAt(k)+" ");
				else
					System.out.print("  ");
				
			}
			System.out.println("  ");
		}
    }
    public static void main(String[] args) {
        String n = "12345";
        getPattern(n);
    }
}
