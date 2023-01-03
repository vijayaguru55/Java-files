/*
 * 20) Evaluate the following expression on paper and on program and understand the difference
    x = x++ * 2 + 3 * –x;

 */

public class Q20 {
    public static void main(String[] args) {
        int x=12;
        x=x++ *2+3*-x;
        // X=(12*2)+(3*(-13))
        System.out.println(x);
    }
}
