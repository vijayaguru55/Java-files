/*
 * 26) Program to Demonstrate the Working of Keyword long
 */

public class Q26 {
    public static void main(String...args) {
        //The Key long is a primitive datatype to store a large value numbers which is 10 to 15 digits
        //it's range from -2^63 to 2^64-1
        //We can't store a decimal values here
        long min = -9223372036854775808L;//we should add l at the end
        long max = 9223372036854775807L;
        
        long a = 'a';//it's also accepting character as a ASCII values  
        System.out.println(min);
        System.out.println(max);
        System.out.println(a);
    }
}
