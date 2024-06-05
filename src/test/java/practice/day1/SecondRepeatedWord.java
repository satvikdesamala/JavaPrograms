package practice.day1;

import java.util.*;

public class SecondRepeatedWord {
    public static void main(String[] args) {
        String str = "I am duplicate string and duplicate of string should be removed";

        String lower = str.toLowerCase();
        secondRepeated(lower);
    }

    public static void secondRepeated(String str){
        String[] words = str.split(" ");
        Integer count = 1;
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        for(String word: words){
            if(!map.containsKey(word)){
                map.put(word,count);
            }else{
                map.put(word, map.get(word)+1);
            }
        }

        List<Integer> cnt = new ArrayList<Integer>();
        for(int c: map.values()){
            cnt.add(c);
        }

        Collections.sort(cnt);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==cnt.get(cnt.size()-2)){
                System.out.println(entry.getKey() + ": "+ entry.getValue());
            }
        }

//        System.out.println(map);

    }
}
