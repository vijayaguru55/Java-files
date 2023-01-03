

/*
 * 53) Write a program to give the following output for the given input:
    Eg 1:  Input: a1b10
    Output: abbbbbbbbbb
    Eg: 2:  Input: b3c6d15
               Output: bbbccccccddddddddddddddd
    The number varies from 1 to 99.

 */
public class Q53 {
    public static String charBynums(String n) {
		String op ="";
		char[] c = n.toCharArray();
		int lastI = 0;
		for (int i = 0; i < c.length; i++) {
			int a = (int)c[i];
			
			if((a >= 97 &&  a<= 122)|| (a>= 65 && a<= 90 )) {
				lastI =i;
				continue;
			}
			int k = Integer.parseInt(String.valueOf(c[i]));
			int l=0;
			if(i+1 < c.length) {
				 l = (int)c[i+1];
				 }
			
			
			if(l>=48 && l<=57) {
				String j = c[i]+""+c[i+1];
				k = Integer.parseInt(j);
				i++;
			}
			String o = "";
			
			
			
			for(int m=k;m>=1;m--) {
				o+=c[lastI];
			}
			op += o;
		
		}
		return op;
	}

    public static void main(String[] args) {
        String s ="a0d1b23c3d11";
        System.out.println(charBynums(s));
    }
}
