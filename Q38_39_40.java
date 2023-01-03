

/*
 * 38) Java Program to print the  largest element in an array
 * 39) Java Program to print the smallest element in an array
 * 40) Java Program to print the number of elements present in an array
 */
public class Q38_39_40{
    public static int getLargestElemnt(int[] n){
        int Max =Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(n[i]>Max)
                Max=n[i];
        }

        return Max;
    }

    public static int getSmallestElemnt(int[] n){
        int Min =n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<Min)
            Min=n[i];
        }

        return Min;
    }

    public static int noOfElements(int[] n){
        //if its a primitve data type we should return length of the Array 
        //because primitive data types can't store a NUll value
        int count = n.length;
        //if given array is non-primitive data type we can use this
        /*int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=null)
                count++;  

        }*/
        return count;
        
    }
    public static void main(String[] args) {
        int[] n = {11,33,23,4,5,6,867,787,89,4,6,7789,0,65,3,2};
        System.out.println("Largest Element is Array is "+getLargestElemnt(n));
        System.out.println("Smallest Element is Array is "+getSmallestElemnt(n));
        System.out.println("Number of elements in array is "+noOfElements(n));
    }
        
}
