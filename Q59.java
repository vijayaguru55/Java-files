

/*
 *59) Find if a String2 is substring of String1. If it is, return the index of the first
        occurrence. else return -1.
        Eg 1: Input: String 1: test123string
                  String 2: 123
                 Output: 4
        Eg 2:  Input: String 1: testing12
                 String 2: 1234
                 Output: -1

 */
public class Q59 {
    public static int subString(String subString,String string){
        int m=subString.length();
        int n= string.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(string.charAt(i+j)!=subString.charAt(j))
                    break;
            }
            if(j==m)
                return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        String str= " testing12", sub="123";

        System.out.println(subString(sub, str));
    }
}
