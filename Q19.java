

/*
 * 19) Evaluate the following expression on paper and on program and understand the difference
 * a+=a++ + ++a + –a + a–; when a=28
 */
public class Q19 {
    public static void main(String[] args) {
        int a=28;
        a+=a++ + ++a + --a + a--;
        // a=28+(28+30+29+29);
        System.out.println(a);
    }   
}
