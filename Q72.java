import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 72.Java Program to remove Duplicate Element in an Array
 */
public class Q72 {
    static Object[] removeDublicateBySet(Object[] n){
        
        Set<Object> set = new HashSet<>();
        for (Object object :n) {
            set.add(object);
        }

        Object[] dup = set.toArray();    
        return dup;    
    }
    

    public static void main(String[] args) {
        Object[] n = {2,3,12,12,12,-4,12,34,3,1,-94,34,5,6,12};
        
        System.out.println(Arrays.toString(removeDublicateBySet(n)));

    }

}
