/*
 * 55) Write a program to print the alphabet 'C' with the stars based on the given numbers
        Eg 1:  Input: 4
                Output:
        ****
        *
        *
        ****

 */
public class Q55 {
    public static void getC(int n){
        if(n<=2){
            System.out.println("Enter Number greater than 2");
            return;
        }
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            }else{
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getC(4);
    }
}
