package practice.day1;

public class PrintNumToWords {
    public static void main(String[] args) {
        int number = 99;
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Eighteen", "Nineteen"};

        if(number==0){
            System.out.println("Zero");
        }else if(number>10 && number<20){
            System.out.println(teens[number%10]);
        }else{
            System.out.print(tens[number/10] + " ");
            System.out.print(ones[number%10]);
        }
    }
}
