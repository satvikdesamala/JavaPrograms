public class FindVowels {
    public static void main(String[] args) {
        String str = "Hello World";

        // Replace all non-vowel characters with an empty string
        String vowels = str.replaceAll("[^aeiouAEIOU]", "");

        // Print the resulting string containing only vowels
        System.out.println("Vowels in the string: " + vowels);
        System.out.println("Count of Vowels: " + vowels.length());
    }

    public static class NumberPalindrome {
        public static void main(String[] args) {
            int number = 123;
            int revNumber = 0;

            while(number>0){
                int digit = number%10;
                revNumber = revNumber*10+digit;
                number= number/10;
            }

            System.out.println(revNumber);
        }
    }
}
