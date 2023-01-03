import java.util.HashMap;
import java.util.Map;

/*
 * 67.Java Program to print the duplicate elements of an array
 */
public class Q67 {
    static void getDuplicatesbyLoop(Object[] n){
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++)
                if(n[j].equals(n[i]) &&n[i]!=null){
                    System.out.println(n[i]);
                    n[i]=null;
                    break;
                }

        }
    }

    static void getDUplicatesByMap(Object[] n){
        Map<Object,Integer> original = new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(!original.containsKey(n[i]))
                original.put(n[i],1);
            else{
                System.out.println(n[i]);
            }
        }
    }



    public static void main(String[] args) {
        Object[] n ={"Vijay","Vijay","Guru","Vijayaguru","Vijay","Guru","Kumar","Krish"};
        Object[] nn = {0,2,3,12,34,5,6,12,2,43,54,34,56,54,0};
       getDUplicatesByMap(n);
       getDuplicatesbyLoop(nn);    
    }
}
