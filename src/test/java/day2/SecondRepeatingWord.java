package day2;

import java.util.*;

public class SecondRepeatingWord {
    public static void main(String[] args) {
        String str = "I am the one who has the java skill. I am I".toLowerCase();

        String[] words = str.split(" ");

        List<Integer> counts = new ArrayList<Integer>();
        Map<String,Integer> map = new HashMap<String, Integer>();

        Integer count = 1;

        for(String word: words){
            if(!map.containsKey(word)){
                map.put(word, count);
            }else{
                map.put(word, map.get(word)+1);
            }
        }

        System.out.println(map);
        for(int cnt: map.values()){
            counts.add(cnt);
        }
        System.out.println(counts);

        Collections.sort(counts);
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==counts.get(counts.size()-2)){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
