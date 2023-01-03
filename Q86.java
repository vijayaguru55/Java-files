/*
 * 86.Java Program to print all the characters in an arrays.
 */
public class Q86{
    static void getChars(Object[] n){
        for (Object cs : n) {
            if(cs.toString().length()<=1){
            if(cs.toString().charAt(0)>=33 &&  cs.toString().charAt(0)<=126){
                System.out.print(cs+" ");
            }}
        }
    }

    public static void main(String[] args) {
        Object[] c = {'a','v','g','k','d',33,"stfdtvh","v",2,3,4};
        getChars(c);
    }
}

