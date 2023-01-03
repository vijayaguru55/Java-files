

/*
 * 16) Write a program to evaluate the polynomial equation
 *  ax^2+bx+c=0;
 */

public class Q16 {

    public static int evaluatePolynomial(int[] n,int l, int x){
        int result = n[0];

        for(int i=1;i<l;i++)
            result = result*x+n[i];

        return result;
        
    }

    public static void evaluateQuadratic(int a, int b, int c){
        if(a==0){
            System.out.println("The value cannot be 0");
            return;
        }
        int d = b*b-4*a*c;

        double sqr = Math.sqrt(d);
        if(d>0){
            System.out.println("The rootd of the equation are real and different.\n");
            System.out.println((double)(-b+sqr)/(2.0*a) +"\n"+(double)(-b-sqr)/(2.0*a));
        }
        else if(d==0){
            System.out.println("The roots of the Equation are real and  same");
            System.out.println((double)b/(2.0*a)+"\n"+ -(double)b/(2.0*a));
        }
        else{
            System.out.println("The roots of the equation are complex and different. \n");  
            System.out.println(-(double)b/(2.0*a)+" i"+sqr+ "\n"+ -(double)b/(2.0*a)+ " -i"+ sqr);
        }

    }


    public static void main(String[] args) {
        int a=2,b=3,c=1;
        evaluateQuadratic(a, b, c);
    }
}
