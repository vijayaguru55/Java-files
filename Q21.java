/*
 * 21) Evaluate the following expression on paper and on program and understand the difference
    If int y = 10 then find int z = (++y * (y++ + 5));
 */
public class Q21 {
    public static void main(String[] args) {
        int y=10;
        int z = (++y *(y++ +5));
        //  z=11*16, y=12
        System.out.println(z);
        System.out.println(y);
    }
}
