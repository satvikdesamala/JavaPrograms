import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsInSentence {
    public static void main(String[] args) {
        String str = "James bond with time bond";

        str = str.toLowerCase();
        String[] words = str.split(" ");

        Set<String> set = new LinkedHashSet<String>();

        for(String word: words){
            set.add(word);
        }

        StringBuilder sb = new StringBuilder();
        for(String element: set){
            sb.append(element).append(" ");
        }

        //remove extra space
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }

        System.out.println(sb);
    }
}
