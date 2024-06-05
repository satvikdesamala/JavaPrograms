package practice.day1;

public class VowelCount {
    public static void main(String[] args) {
        String str = "I am Vowel with Upper And Lower Cases";

        String vowels = str.replaceAll("[^AEIOUaeiou]","");

        System.out.println(vowels);
        System.out.println("Length: "+ vowels.length());

        printUpperLower(str);
    }

    public static void printUpperLower(String str){
        char[] chars = str.toCharArray();

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        for(int i=0; i<chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                upper.append(chars[i]);
            }else if(Character.isLowerCase(chars[i])){
                lower.append(chars[i]);
            }
        }

        System.out.println("Lower characters: "+ lower.toString());
        System.out.println("Upper characters: "+ upper.toString());

    }
}
