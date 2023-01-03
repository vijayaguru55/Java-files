import java.util.Arrays;
/*
 * 94.Java Program to find the given two strings are anagram to each other
 */
public class Q94 {
    static void isAnagramBySorting(String a,String b){
        char[] c1 =a.toCharArray();
        char[] c2 =b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(a.length()!=b.length()){
            System.out.println("Not an anagram.");
            return;
        }
        for(int i=0;i<a.length();i++){
            if(c1[i]!=c2[i]){
                System.out.println("Not an anagram.");
                return;
            }

        }
        System.out.println("Given Strings are anagram.");
    }

    static void isAnagram(String a, String b){
        if(a.length()!=b.length()){
            System.out.println("Not an anagram.");
            return;
        }
        char[] c1 =a.toCharArray();
        char[] c2 =b.toCharArray();
        int[] count =new int[128];

        for(int i=0;i<a.length();i++){
            count[c1[i]]++;
            count[c2[i]]--;
        }

        for (int i : count) {
            if(i!=0){
                System.out.println("Not an anagram.");
                return;
            }
        }
        System.out.println("Given Strings are anagram.");
    
    }
    public static void main(String[] args) {
        String s1 ="silent",s2="listen",s3 = "listin";
        isAnagram(s1, s2);
        isAnagramBySorting(s1, s3);
        
    }
}
