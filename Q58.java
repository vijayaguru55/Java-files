/*
 * 58) Write a program to print the following pattern for the given input number.
        Eg 1:  Input: 4
                Output:
        ********
        ***__***
        **____**
        *______*
        **____**
        ***__***
        ********
 */
public class Q58 {
    static void getPattern(int n){
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n*2;j++){
                
              if(i<=n){
                if((i+j>=n+2)&&j<n+i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
               
            }
           
            }
             System.out.println();
        }
        for(int i=n;i>=1;i--){
            
            for(int j=1;j<=n*2;j++){
                
              if(i<=n){
                if((i+j>=n+2)&&j<n+i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
               
            }
           
            }
             System.out.println();
        }
       
    }
    public static void main(String[] args) {
        getPattern(5);
    }
}
