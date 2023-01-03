/*
 * 27) Program to Swap Two Numbers
 */

public class Q27 {
    public static void main(String[] args) {
        int a=23,b=12;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("-------------------------");
        //swap with tempraury variable
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("-------------------------");
        a=23;b=12;
        //swap without tempraury variable
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("-------------------------");
        
    }
}
