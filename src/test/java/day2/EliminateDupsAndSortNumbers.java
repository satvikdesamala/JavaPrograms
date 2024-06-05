package day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EliminateDupsAndSortNumbers {
    public static void main(String[] args) {
        String str = "ammmaaabbb12239647759";

        Set<Character> letter = new LinkedHashSet<Character>();
        Set<Character> numbers = new TreeSet<Character>();
        char[] chars = str.toCharArray();

        for(char ch: chars){
            if(Character.isDigit(ch)){
                numbers.add(ch);
            }
            if(Character.isLetter(ch)){
                letter.add(ch);
            }
        }

        System.out.println(numbers);
        System.out.println(letter);

        StringBuilder result = new StringBuilder();

        for(char ch: letter){
            result.append(ch);
        }
        for(char ch: numbers){
            result.append(ch);
        }

        System.out.println(result.toString());
    }
}
