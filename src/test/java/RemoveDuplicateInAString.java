import java.util.*;

public class RemoveDuplicateInAString {
    public static void main(String[] args) {
        String str = "the string has duplicates so delete duplicates from the string";

        String[] words = str.split(" ");
        Set<String> unique = new LinkedHashSet<String>();

        for(String word: words){
            unique.add(word);
        }
        System.out.println(unique);
        StringBuilder result = new StringBuilder();
        for(String s: unique){
            result.append(s).append(" ");
        }
        System.out.println(result.toString());
    }
}
