

/*
 * 56) Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
  4 5 6
7 8 9 10

 */
public class Q56 {
    static int getLevel(int n){
        int l=1,sum=0;
        int i=1;
        
        do{
            l++;
            sum+=i++;
        }while(sum<n);
      
        return l;
    }
    public static void getPyramid(int n){
        int out = getLevel(n);
        
        int in = out+(out-1);
        int st=1;
        for(int i=1;i<=out;i++){
            
            for(int j=1;j<=in;j++){
                if(i+j>=out+1 && j<out+i){
                   if((i+j)%2!=0)
                        System.out.print(st+++" ");
                    else{
                        System.out.print(" ");}}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getPyramid(10);
    }
}
