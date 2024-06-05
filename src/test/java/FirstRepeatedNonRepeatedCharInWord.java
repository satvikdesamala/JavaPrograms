import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class FirstRepeatedNonRepeatedCharInWord {

    public static void main(String[] args) {
        String str = "AMAZON";

        String word = str.toLowerCase();

        char[] chars = word.toCharArray();
        Integer count = 1;

        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();

        for(int i=0; i<chars.length; i++){
            if(!map.containsKey(chars[i])){
                map.put(chars[i],count);
            }else{
                map.put(chars[i], map.get(chars[i])+1);
            }
        }

        for(Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            if(entry.getValue()==1){
                System.out.println("First non repeated char: "+ entry.getKey());
                break;
            }
        }

        for(Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            if(entry.getValue()>1){
                System.out.println("First repeated char: "+ entry.getKey());
                break;
            }
        }
    }

    public static class ReverseStringWithoutSplChars {
        public static void main(String[] args) {
            String str = "Hello!, How are you?";
            String result = "";

            String[] wordsAndSpecials = str.split("(?<=\\W)|(?=\\W)");

            // regex separates words and special chars in an array
            System.out.println(Arrays.toString(wordsAndSpecials));

            for(int i=0; i< wordsAndSpecials.length;i++){
                // reverse the word only if the first char of the word is not special character
                if(Character.isLetterOrDigit(wordsAndSpecials[i].charAt(0))){
                   wordsAndSpecials[i] = new StringBuilder(wordsAndSpecials[i]).reverse().toString();
                }
            }
            System.out.println(Arrays.toString(wordsAndSpecials));
            for(String word: wordsAndSpecials){
                result = result+word;
            }
            System.out.println("Original: "+str);
            System.out.println("Result: "+result);
        }
    }
}
