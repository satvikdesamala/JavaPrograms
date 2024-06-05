import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,5};

        Set<Integer> set = new HashSet<Integer>();
//        Set<Integer> dupSet = new HashSet<Integer>();
//        for(Integer n: arr){
//            if(!set.contains(n)){
//                set.add(n);
//            }else{
//                dupSet.add(n);
//            }
//        }
        for(int n: arr){
            set.add(n);
        }

        Integer[] array = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));

//        Iterator<Integer> itr = set.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
