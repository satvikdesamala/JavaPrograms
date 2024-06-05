public class NumberToWordConverter {
    private static final String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();

        // Handle tens and ones places
        if (num >= 10 && num < 20) {
            result.append(teens[num % 10]);
        } else {
            result.append(tens[num / 10]).append(" ");
            result.append(ones[num % 10]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int number = 99;
        String wordRepresentation = numberToWords(number);
        System.out.println("Word representation of " + number + ": " + wordRepresentation);
    }
}
