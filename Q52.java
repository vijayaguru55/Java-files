

/*
 * 52) Using Recursion reverse the string such as
        Eg 1:  Input: one two three
               Output: three two one
        Eg 2:  Input: I love india
               Output: india love I
 */
public class Q52 {
    public static String reverse(String line){
       if(line.isEmpty())
            return line;
        else{
            return reverse(line.substring(1))+line.charAt(0);
        }
    }

    public static String reverseTheLine(String line){
        char[] s=line.toCharArray();
        String out="";
        int start=0;
        for(int end=0;end<line.length();end++){
            if(s[end]==' '){
                out+=reverse(line.substring(start,end))+" ";
                start=end+1;
            }
        }
        out+=reverse(line.substring(start,line.length()));
        
        return reverse(out);
        
    }
    public static void main(String[] args) {
        String s = "I love india";
        
        System.out.println(reverseTheLine(s));

    }
}
