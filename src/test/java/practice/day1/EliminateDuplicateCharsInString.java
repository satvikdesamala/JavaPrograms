package practice.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class EliminateDuplicateCharsInString {
    public static void main(String[] args) {
        String str = "AMMAmmA15392";

        char[] chars = str.toLowerCase().toCharArray();

        removeDupChars(chars);
    }

    public static void removeDupChars(char[] chars){
        Set<Character> set = new LinkedHashSet<Character>();
        StringBuilder result = new StringBuilder();
        StringBuilder resultInt = new StringBuilder();
        for(Character ch: chars){
            set.add(ch);
        }

        for(Character ch: set){
            if(Character.isLetter(ch)){
                result.append(ch);
            }else if(Character.isDigit(ch)){
                resultInt.append(ch);
            }

        }

        System.out.println(result.toString());
        System.out.println(resultInt.toString());

        String intChars = resultInt.toString();
        String[] arr = intChars.split("");
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        StringBuilder finalInt = new StringBuilder();
        for(String num: arr){
            finalInt.append(num);
        }

        StringBuilder finalResult = new StringBuilder();
        finalResult.append(result).append(finalInt);

        System.out.println(finalResult.toString());


    }
}
