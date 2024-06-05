package day2;

import java.util.Arrays;

public class ReverseWordsWithoutSplChars {
    public static void main(String[] args) {
        String str = "hello! How are you? I'm fine";

        String[] splAndChars = str.split("(?<=\\W)|(?=\\W)");
        System.out.println(Arrays.toString(splAndChars));

        for(String word: splAndChars){
            for(int i=0; i<splAndChars.length; i++){
                if(Character.isLetterOrDigit(word.charAt(0))){
                    splAndChars[i] = new StringBuilder(splAndChars[i]).reverse().toString();
                }
            }
        }
        System.out.println(Arrays.toString(splAndChars));
    }
}
