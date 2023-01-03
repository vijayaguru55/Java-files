import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 65.Java Program to find the frequency of each element in the array
 */
public class Q65 {
    static void getFrequency(Object[] n){//time O(n)
        Map<Object,Integer> map = new HashMap<>();
        for (Object object : n) {
            if(!map.containsKey(object))
                map.put(object, 1);
            else
                map.replace(object, map.get(object)+1);
        }
        
        for (Map.Entry<Object,Integer> object : map.entrySet()) {
            System.out.printf(object.getKey()+"\t"+object.getValue());
            System.err.println();
        }
    }

    static void getFreqByArray(Object[]n){  //time O(nlogn)
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            int count=1;
            while(i<n.length-1 && n[i].equals(n[i+1])){
                count++;
                i++;
            }

            System.out.println(n[i]+"\t"+count);
            count++;

        }
    }
    public static void main(String[] args) {
        Object[] n ={"Vijay","Vijay","Guru","Vijayaguru","Vijay","Guru","Kumar","Krish"};
        Object[] nn = {2,3,12,34,5,6,12,3,0,6,68,9,9,0,-42};
        getFrequency(n);
        getFreqByArray(nn);
    }
}
