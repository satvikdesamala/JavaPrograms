public class VowelCountAndLetterCase {
    public static void main(String[] args) {
        String input = "Hello World! Java Programming";

        // Count and print the number of vowels
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);

        // Print uppercase and lowercase letters together
        printUpperAndLowerCase(input);
    }

    // Method to count vowels in a string
    public static int countVowels(String str) {
//        int count = 0;
//        String vowels = "aeiouAEIOU";
//        for (char c : str.toCharArray()) {
//            if (vowels.indexOf(c) != -1) {
//                count++;
//            }
//        }
//        return count;

        String vowels = str.replaceAll("[^aeiouAEIOU]","");
        return vowels.length();
    }

    // Method to print uppercase and lowercase letters together
    public static void printUpperAndLowerCase(String str) {
        StringBuilder upperCaseLetters = new StringBuilder();
        StringBuilder lowerCaseLetters = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseLetters.append(c);
            } else if (Character.isLowerCase(c)) {
                lowerCaseLetters.append(c);
            }
        }

        System.out.println("Uppercase letters: " + upperCaseLetters.toString());
        System.out.println("Lowercase letters: " + lowerCaseLetters.toString());
    }
}
