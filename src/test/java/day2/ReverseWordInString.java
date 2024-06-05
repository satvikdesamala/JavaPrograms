package day2;

public class ReverseWordInString {
    public static void main(String[] args) {
        String[] words = "string reverse am i".split(" ");
        String revStr = "";

        for(String word: words){
            String revWord = "";
            char[] chars = word.toCharArray();
            for(int i=chars.length-1; i>=0; i--){
                revWord = revWord + chars[i];
            }

            revStr = revStr+revWord+ " ";
        }
        System.out.println(revStr);
    }
}
