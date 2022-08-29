import java.util.Scanner;

public class IfElse_digit2word {
    private static  String numbertoWord(int a) {
        String word = "";
        String unitarray[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "ninteen"};
        String tensarray[] = {"zerp", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
        if (a == 0) {
            return "zero";
        }
        if (a < 0) {
            String number = "" + a;
            number = number.substring(1); //for removing minus sign
            return "minus" + numbertoWord(Integer.parseInt(number));
        }
        if ((a / 100000) > 0) {
            word = word + numbertoWord(a / 100000) +" "+ "lac";
            a = a % 100000;
        }
        if ((a / 1000) > 0) {
            word = word + numbertoWord(a / 1000) + " "+ "thousand";
            a = a % 1000;
        }
        if ((a / 100) > 0) {
            word = word + numbertoWord(a / 100) +"  "+ "hundread";
            a = a % 100;
        }
        if (a > 0) {
            if (a < 20) {
                word = word +" " +unitarray[a];
            } else {
                word = word +" "+ tensarray[a / 10];
                if ((a % 10) > 0) {
                    word = word +"-"+ unitarray[a % 10]; //-sign add
                }
            }
        }return word;


    }

    public static void main(String[] args) {
        int number=0;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number==0)
        {
            System.out.println("zero");
        }
        else{
            System.out.println("number in word"+":  "+numbertoWord(number));
        }
    }
}