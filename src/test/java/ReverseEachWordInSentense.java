public class ReverseEachWordInSentense {
    public static void main(String[] args) {
        String str = "Jack and Jones are friends";
        String[] words = str.split(" ");
        String reverse = "";

        for(String word: words){

            String reverseWord = "";

            String[] chars = word.split("");

            for(int i= chars.length-1;i>=0; i--){
                reverseWord = reverseWord + chars[i];
            }
            reverse = reverse + reverseWord + " ";
        }
        System.out.println(reverse);
    }
}
