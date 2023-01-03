/*
 * 13) Write a program to find the area of the square
 */
public class Q13 {

    public static int getArea(int l){
        return l*l;
    }
    public static void main(String[] args) {
        int areaLength = 141;
        int areaOfTheSquare = getArea(areaLength);
        System.out.println(areaOfTheSquare);
    }
}
