

/*
 * 18) Evaluate the following expression on paper and on program and understand the  difference
    i) ++a-b–-                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2
 */
public class Q18 {
    public static void main(String[] args) {
        int a=2, b=3;

        //++a ----> preIncrement a=3;
        System.out.println( ++a-b--);

        a=2;
        System.out.println(a%b++);
        System.out.println(b);

        System.out.println(a*=b+5);//--> a=a*b+5-->a=2*9;
        int x= 69>>>2;//unsigned right shift operator removing last binary as given count
        System.out.println(x);
    }
}
