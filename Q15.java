/*
 * 15) Write a program to find the area of the cylinder
 */

public class Q15 {

    public static float getArea(float height, float radius){
        //Area = 2Pi (r+h); pi =3.14 or 22/7
        
        float area = (2*22*(radius+height)/7);
        return area;
    }
    public static void main(String[] args) {
        float height = 8.6f;
        float radius = 8.9f;
        float area =getArea(height, radius);
        System.out.format("Area of the Cylinder is %.4f",area);
    }
}
