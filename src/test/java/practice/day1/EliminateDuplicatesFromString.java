package practice.day1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EliminateDuplicatesFromString {
    public static void main(String[] args) {
        String str = "I am duplicate string and duplicate of string should be removed";

        String lower = str.toLowerCase();
        removeDuplicateWords(lower);
    }

    public static void removeDuplicateWords(String str){
        String[] words = str.split(" ");

        Set<String> set = new LinkedHashSet<String>();

        for(String word: words){
            set.add(word);
        }

        StringBuilder result = new StringBuilder();
        for(String word: set){
            result.append(word).append(" ");
        }

        System.out.println("String without duplicates: "+ result.toString().trim());
    }
}
