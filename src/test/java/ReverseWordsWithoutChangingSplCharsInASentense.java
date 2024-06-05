import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;

public class ReverseWordsWithoutChangingSplCharsInASentense {

    static boolean isSpecialChar(char ch) {
        // Define your criteria for special characters
        return !Character.isLetterOrDigit(ch);
    }

    static String reverseWords(String str) {
        String[] wordsAndSpecials = str.split("(?<=\\W)|(?=\\W)");

        System.out.println(Arrays.toString(wordsAndSpecials));

        // Reverse words only
        for (int i = 0; i < wordsAndSpecials.length; i++) {
            if (!isSpecialChar(wordsAndSpecials[i].charAt(0))) {
                wordsAndSpecials[i] = new StringBuilder(wordsAndSpecials[i]).reverse().toString();
            }
        }

        // Concatenate the array back into a string
        StringBuilder result = new StringBuilder();
        for (String wordOrSpecial : wordsAndSpecials) {
            result.append(wordOrSpecial);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello! world, good?";
        String reversed = reverseWords(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}

