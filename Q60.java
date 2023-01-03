/*
 * 60) Write a program to find the sum of the series. The series will be like 1 +11 + 111 + 1111 +.. n terms.
        Eg 1: Input:  Input the number of terms : 5
        Output :
        1 + 11 + 111 + 1111 + 11111
        The Sum is : 12345
        Eg 2: Input:  Input the number of terms : 3
        Output :
        1 + 11 + 111
        The Sum is : 123
 */
public class Q60 {
    static int getSeries(int n){
        int sum=1;
        if(n>1){
            for(int i=1;i<n;i++){
                sum*=10;
                sum++;
            }
                

        }
        return sum;
    }

    static int sumOfSeries(int n){
        if(n<=0)
            return n;
       int sum=0;
       for(int i=n;i>=1;i--)
            sum+=getSeries(i);

        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumOfSeries(n));
    }
}
