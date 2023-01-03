/*
 * 96.Java program to find a character in a word string linear search.
 */
public class Q96 {
    static void linearSearch(String a,char target){ //time O(n)
        int index =-1;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==target){
                index=i;
                System.out.println("character "+target+" prensent at index "+index);
                return;
            }
        }
        System.out.println("Character not found");
    }

    static void linearSearchByHalfLooping(String s,char target){ //time O(n/2+1)
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==target){
                System.out.println("character "+target+" prensent at index "+i);
                return;
            }else if(s.charAt(j)==target){
                System.out.println("character "+target+" prensent at index "+j);
                return;
            }
            i++;j--;
        }
        System.out.println("Character not found");

    }

    public static void main(String[] args) {
        String word = "Engineering";
        linearSearch(word, 'o');
        linearSearchByHalfLooping(word, 'i');
    }
}
