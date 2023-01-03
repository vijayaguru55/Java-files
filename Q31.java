/*
 * 31) Program to Find the Roots of a Quadratic Equation
 */
public class Q31 {

    public static void getRoots(double a, double b,double c){
        double r1,r2;

        double d = b*b-4*a*c;
 
        if(d>0){
            r1 = (-b+ Math.sqrt(d))/(2*a);
            r2 = (-b- Math.sqrt(d))/(2*a);

            System.out.format("Root1  = %.2f  and Root2 = %.2f",r1,r2);
        }else if(d==0){
            r1=r2=-b/(2*a);
            System.out.format("Root1 = Root2 = %.2f",r1);
        }else{
            double real = -b/(2*a);
            double ima = Math.sqrt(-d)/(2*a);
            System.out.format("Root1 = %.2f + %.2fi",real, ima);
            System.out.format("\nRoot2 = %.2f + %.2fi",real, ima);
        }
    }
    public static void main(String[] args) {
        double a=2.3,b=4,c=5.6;
        getRoots(a, b, c);
    }
}
