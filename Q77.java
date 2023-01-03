import java.util.Arrays;

/*
 * 77.Java Program to sort the elements of an array in ascending order
 */
public class Q77 {
    static void selectionSort(int[] n, boolean ascending){
        for(int i=0;i<n.length;i++){
            int pivot = n[i], index=i;
            for(int j=i;j<n.length;j++){
                if(ascending?n[j]<pivot:n[j]>pivot){
                    pivot=n[j];
                    index=j;
                }
                
            }
            int temp = n[i];
                n[i]=pivot;
                n[index]=temp;
        }
    }

    static void bubbleSort(int[] n, boolean ascending){
        for(int i=1;i<n.length;i++){
            for(int j=0;j<n.length-i;j++){
                if(ascending?n[j]>n[j+1]:n[j]<n[j+1]){
                    int t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
    }

    static void insertionSort(int[] n, boolean ascending){
        for(int i=1;i<n.length;i++){
            System.out.println(Arrays.toString(n));
            for(int j=i;j>0;j--){
                if(ascending?n[j]<n[j-1]:n[j]>n[j-1]){
                    int t= n[j];
                    n[j]=n[j-1];
                    n[j-1]=t;
                }else{
                    break;
                }
            }
            
        }
    }

    static void mergeSort(int[] n,int s, int e,boolean ascending){
        if((e-s) ==1)
            return ;
        int mid = (s+e)/2;
        
        mergeSort(n,s,mid,ascending);
        mergeSort(n,mid,e,ascending);


        int[] sorted=new int[e-s];
        int i=s,j=mid,k=0;


        while(i<mid&& j<e){
            if(ascending?(n[i]<n[j]):(n[i]>n[j]))
                sorted[k++]=n[i++];
            else
                sorted[k++]=n[j++];
        }

        while(i<mid)
            sorted[k++]=n[i++];
        while(j<e)
            sorted[k++]=n[j++];

        for(k=0;k<sorted.length;k++){
            n[s+k]=sorted[k];
        }
    }


    static void quickSort(int[] n, int low, int high, boolean ascending){
         if(low>=high)
            return;
        int start =low, end=high, mid =(low+high)/2, pivot = n[mid];
        while(start<=end){
            while(ascending?n[start]<pivot:n[start]>pivot){
                start++;
            }
            while(ascending?n[end]>pivot:n[end]<pivot){
                end--;
            }
            if(start<=end){
                int temp =n[start];
                n[start] =n[end];
                n[end]=temp;
                start++;
                end--;
            }
        }

        quickSort(n, low, end, ascending);
        quickSort(n, start, high, ascending);
    }
    public static void main(String[] args) {
        int[] n = {2,3,12,12,12,-4,12,34,3,1,-94,34,5,6,12,0};
        quickSort(n, 0,n.length-1,true);        //give false for descending order
        System.out.println(Arrays.toString(n));
        //System.out.println(Arrays.toString(n));
    }
}
