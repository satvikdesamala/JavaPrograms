public class FindACharOccuranceInAWord {
    public static void main(String[] args) {
        String str = "Simultaneously";
        str = str.toLowerCase();
        int s_occ = str.length() - str.replaceAll("s", "").length();
        System.out.println(s_occ);
    }
}
