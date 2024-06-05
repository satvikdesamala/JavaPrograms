import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatedNonRepeatedWordInSentence {

    public static void main(String[] args) {
        String str = "Java is a language to write a java program";

        str = str.toLowerCase();

        String[] words = str.split(" ");
        Integer count = 1;

        Map<String,Integer> map = new LinkedHashMap<String, Integer>();

        for(int i=0; i<words.length; i++){
            if(!map.containsKey(words[i])){
                map.put(words[i],count);
            }else{
                map.put(words[i], map.get(words[i])+1);
            }
        }

        for(Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            if(entry.getValue()==1){
                System.out.println("First non repeated char: "+ entry.getKey());
                break;
            }
        }

        for(Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            if(entry.getValue()>1){
                System.out.println("First repeated char: "+ entry.getKey());
                break;
            }
        }
    }
}
