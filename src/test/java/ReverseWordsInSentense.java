public class ReverseWordsInSentense {
    public static void main(String[] args) {
        String sentense = "Java is a programming language";
        String[] words = sentense.split(" ");

        String reverse = "";
        for(int i = words.length-1; i>=0; i-- ){
            reverse = reverse + words[i] + " ";
        }
        System.out.println(reverse);
    }
}
