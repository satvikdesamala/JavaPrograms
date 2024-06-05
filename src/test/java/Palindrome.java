public class Palindrome {
    public static void main(String[] args) {
        String word = "AMEDMA";
        isPalindrome(word);
    }

    public static void isPalindrome(String str){
        String reverseStr = "";

        String[] chars = str.split("");

        if(!chars[0].equals(chars[chars.length-1])){
            System.out.println(chars[0]);
            System.out.println(chars[chars.length-1]);
            System.out.println("Not a palindrome");
            return;
        }

        for(int i = chars.length-1; i>=0; i--){
            reverseStr = reverseStr + chars[i];
        }

        if(str.equals(reverseStr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
