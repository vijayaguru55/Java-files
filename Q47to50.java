/*
 * 47 - 50) Write a programs to print following patterns
 */
public class Q47to50{
    public static void invertedTriangle(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<n*2;j++){
                if(i+j>=n+1&& j<n+i){
                    if((i+j)%2==0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }

    public static void invertedTriangleByNumber(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<n*2;j++){
                if(i+j>=n+1&& j<n+i){
                    if((i+j)%2==0)
                        System.out.print(i);
                    else
                        System.out.print(" ");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }

    public static void triangleByAscending(int n){
        for(int i=1;i<=n;i++){
            int k=0;
            for(int j=1;j<n*2;j++){
                if(i+j>=n+1 && j<n+i){
                    if((j-n+i)>i)
                        System.out.print(--k+" ");
                    else
                        System.out.print(++k+" ");
                }else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }

    public static void triangleByDescending(int n){
        for(int i=1;i<=n;i++){
            int k=0;
            for(int j=1;j<n*2;j++){
                if(i+j>=n+1 && j<n+i){
                    if((j-n+i)>i) 
                        System.out.print(n-i+--k+" ");
                    else
                        System.out.print(n-i+(++k)+" ");
                }else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangleByAscending(9);
        triangleByDescending(9);
        invertedTriangle(9);
        invertedTriangleByNumber(9);
    
    }
}
