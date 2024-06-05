import java.util.Arrays;

public class AnagramWithSorting {
    public static void main(String[] args) {
        String str1 = "Race".toLowerCase();
        String str2 = "Care".toLowerCase();

        if(str1.length()!=str2.length()){
            return;
        }

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        System.out.println(s1);
        System.out.println(s2);

        if(Arrays.equals(s1,s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
