package day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class EliminateDupsFromString {
    public static void main(String[] args) {
        String str = "this Is dup and dup is this String".toLowerCase();

        String[] words = str.split(" ");

        Set<String> unique = new LinkedHashSet<String>();
        StringBuilder result =  new StringBuilder();


        for(String word: words){
            unique.add(word);
        }

        for(String word: unique) {
            result.append(word).append(" ");
        }
        System.out.println(result.toString().trim());

    }
}
