/* 
 * 4) Write a program to define the functionality of a Bitwise operators.
 */
public class Q4 {
    /*Bitwise operatorse are
     * 1.Bitwise OR ---------> '|' 
     * 2.Bitwise AND --------> '&'
     * 3.Bitwise XOR --------> '^'
     * 4.Bitwise NOT --------> '~'
     * 5.Bitwise left Shift -> '<<'
     * 6.Bitwise Right Shift-> '>>'
     */

     public static void main(String[] args) {
        /*Bitwise OR it check the binary values of  given two numbers:-
            e.g:- a=5 --> 101
                  b=7 --> 111  Now --> a | b -->  111
                  *It return 111 as Dcimel value --> 7
        */    

        System.out.println(" Bitwise OR for  5 | 7 is = "+(5|7));

        /*Bitwise AND it check the binary values of  given two numbers:-
            e.g:- a=5 --> 101
                  b=7 --> 111  Now --> a & b -->  105
                  *It return 111 as Dcimel value --> 5
        */
        System.out.println(" Bitwise AND for 5 & 7 is = "+(5&7));

        /*Bitwise XOR it check the binary values of  given two numbers:-
            it return true for both binary are fasle else retrun false;
            e.g:- a=5 --> 101
                  b=7 --> 111  Now --> a ~ b -->  010
                  *It return 111 as Dcimel value --> 2
        */
        System.out.println(" Bitwise XOR for 5 ^ 7 is = "+(5^7));

        /*Bitwise NOT it changes the binary values of  given number by 0s by 1 and 1s by 0:-
            e.g:- a=5 --> 101
                              a= 00000000 00000000 00000000 00000101
                  Now --> ~a --> 11111111 11111111 11111111 11111010
                  *It return  as Dcimel value --> -6
        */
        System.out.println(" Bitwise NOT for ~5 is   = "+(~5));

        /*Bitwise Left Shift it shift the allbits by given times, which means adding zero to the end 
            
            e.g:- a=5 --> 101
                   a= 10100
                  *It return 111 as Dcimel value --> 20
                
            in another way we can say it could be multiple by 2 by the given times
            it means  5<<2 as 5*2=10*2 =20
        */
        System.out.println(" Bitwise XOR for 5 << 7 is = "+(5<<2));

        /*Bitwise Right Shift it shift the allbits by given times, which means adding zero to the starting 
            
            e.g:- a=5 --> 101
                   a= 001
                  *It return 111 as Dcimel value --> 20
                
            in another way we can say it could be divide by 2 by the given times
            it means  5<<2 as 5/2=2/2=1;
        */
        System.out.println(" Bitwise XOR for 5 >> 7 is = "+(5>>2));
     }
}
