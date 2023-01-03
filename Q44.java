import java.util.HashMap;
import java.util.Map;

/*
 * 44) Java Program to print the duplicate elements of an array
 */
public class Q44 {
    public static void getDuplicates(int[] n){
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(!map.containsKey(n[i])){
                map.put(n[i],1);
            }else{
                map.replace(n[i],map.get(n[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            if(i.getValue()>1)
                System.out.println(i.getKey());
        }
    }

    
    public static void main(String[] args) {
        int[] n ={11,33,4,2,3,3,3,2,1,1,4,5,5,6,79,0,65,65,79,3,2};
        System.err.println("Dublicate elemnts are :");
        getDuplicates(n);
    }
}
