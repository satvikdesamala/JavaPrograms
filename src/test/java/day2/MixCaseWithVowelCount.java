package day2;

public class MixCaseWithVowelCount {
    public static void main(String[] args) {
        String str = "AmmeiotrWeRTO";

        String vowels = str.replaceAll("[^aeiouAEIOU]","");
        System.out.println(vowels);
        System.out.println(vowels.length());

        printMixCase(str);
    }

    public static void printMixCase(String str){
        char[] chars = str.toCharArray();

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        for(int i=0; i<chars.length;i++){
            if(Character.isUpperCase(chars[i])){
                upper.append(chars[i]);
            }
            if(Character.isLowerCase(chars[i])){
                lower.append(chars[i]);
            }

        }

        System.out.println(upper);
        System.out.println(lower);
    }
}
