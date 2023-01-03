import java.util.HashMap;
import java.util.Map;

/*
 * 42) Java Program to find the frequency of each element in the array
 */
public class Q42 {

    public static void frequencyOfElementsInArray(int[] n){
    
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(!map.containsKey(n[i])){
                map.put(n[i],1);
            }else{
                map.replace(n[i],map.get(n[i])+1);
            }
        }
        System.out.println("Element    Frequency");
        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            
            System.out.println("  "+i.getKey()+"    |    "+i.getValue());
        }
    }
    public static void main(String[] args) {
        int[] n = {11,33,4,2,3,3,3,2,1,1,4,5,5,6,79,0,65,3,2};
        frequencyOfElementsInArray(n);
    }   
}
