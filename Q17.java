/*
 * 17) Given the radius of two concentric circle, find the area of the space between the circles.
 */
public class Q17 {
    public static double concentricSpace(double r1, double r2){
        double pi = Math.PI;
        double area1 = pi*(r1*r1);  //Area of outer circle
        double area2 = pi*(r2*r2);  //Area of inner circle

        return area1-area2;
    }
    public static void main(String[] args) {
        double outerRad =6;
        double innerRad = 4;
        System.out.println(concentricSpace(outerRad, innerRad));
    }
}
