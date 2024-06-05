import java.util.Arrays;

public class AnagramChecker_WithoutArraysSort {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if length is the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Initialize an array to store character frequencies
        int[] charCount = new int[26]; // Assuming only lowercase letters

        // Increment count for characters in str1
        for (char ch : str1.toCharArray()) {
            charCount[ch - 'a']++;
//            System.out.println(charCount[ch - 'a']++);
        }

        // Decrement count for characters in str2
        for (char ch : str2.toCharArray()) {
            charCount[ch - 'a']--;
//            System.out.println(charCount[ch - 'a']--);
        }
        System.out.println(Arrays.toString(charCount));

        // If all counts are zero, the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
