
/*
 *100) Java Program to convert ASCHII value to character(for A-Z only) without using special function
 */

public class Q100 {
    
    static void getValue(int n){
        if(n<65 || n>90 && n<97 || n>122){
            System.out.println("Given ASCII value is not an alphate");
            return;
        }
        char value=0;
        if(n>=65 && n<=90){
            value=65;
            while(value!=n){
                value++;
            }
        }
        else{
            value=97;
            while(value!=n){
                value++;
            }

        }
        System.out.println(value);
       
    }

    static void getCapitalBytypeCasting(int n){
        if(n<65 || n>90 && n<97 || n>122){
            System.out.println("Given ASCII value is not an alphate");
            return;
        }
        System.out.println((char)n);
    }

   public static void main(String[] args) {
    int ascii = 96;
    getValue(ascii);
    getCapitalBytypeCasting(70);
   } 
}
