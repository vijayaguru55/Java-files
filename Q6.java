/* 
 * 6) Write a program for the following. Let consider 20 students in a class with the roll no
    101-120. We are going to split them into four groups. Based on their roll number we are
    going to split them with the following logics.
    Input : Total Number of students : 20
    Output:             Group 2:
    Group 1:            102
    101                 106
    105                 110
    109                 114
    113                 118
    117 
 */

public class Q6 {

    public static void getGroup(int n, int g,int r){
    
        for(int i=1;i<=g;i++){
            System.err.println("Group "+i);
            for(int j=r-1+i;j<r+n;j+=g){
                System.out.println("  "+j+"  ");
            }
        }

    }
    public static void main(String[] args) {
        int noOfStudents =25, noOfgroups=5, rollNoFrom=101;
        getGroup(noOfStudents,noOfgroups, rollNoFrom);
    }
}
