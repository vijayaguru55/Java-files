

/*
 * 14) Write a program to find the area of the rectangle
 */
public class Q14 {
    public static int getArea(int height, int width){
        return width*height;
    }
    public static void main(String[] args) {
        int height = 18;
        int width = 9;
        int area = getArea(height,width);
        System.out.println(area);
    }
}
