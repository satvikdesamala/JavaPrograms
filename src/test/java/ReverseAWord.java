public class ReverseAWord {
    public static void main(String[] args) {
        String word = "Amazon";
        String[] chars = word.split("");
        String reverseWord = "";

        for(int i = chars.length-1; i>=0; i--){
            reverseWord = reverseWord + chars[i];
        }

        System.out.println(reverseWord);
    }
}
