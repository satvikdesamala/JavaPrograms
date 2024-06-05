import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4,1,5,2,3,4,1};

        Integer count = 1;

        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        for(Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ " repeated " + entry.getValue());
            }
        }

        for(Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+ " Non repeated " + entry.getValue());
            }
        }

    }
}
