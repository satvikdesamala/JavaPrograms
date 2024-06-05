public class ReverseStringWithStartingCapital {
    public static void main(String[] args) {
        String input = "Reverse the String with Starting Letter as Capital";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        StringBuilder reverseString = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            reverseString.append(words[i]).append(" ");
        }

        String[] revStrWords = reverseString.toString().split(" ");
        for (String word : revStrWords) {
            if (Character.isUpperCase(word.charAt(0))) {
                result.append(word).append(" ");
            } else {
                result.append(word.substring(0,1).toUpperCase()+ word.substring(1)).append(" ");
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String with Starting Letter as Capital: " + result.toString().trim());
    }

}
