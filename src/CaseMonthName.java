import java.util.Scanner;

//Write a Program to print the month name for the given number
public class CaseMonthName {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter month Number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        if (n == 1) {
            System.out.println("Jan = 31 Days");
        } else if (n == 2) {
            System.out.println("Feb = 28 Days");
        } else if (n == 3) {
            System.out.println("Mar = 31 Days");
        } else if (n == 4) {
            System.out.println("Apr = 30 Days");
        } else if (n == 5) {
            System.out.println("May = 31 Days");
        } else if (n == 6) {
            System.out.println("Jun = 30 days");
        } else if (n == 7) {
            System.out.println("Jul = 31 Days");
        } else if (n == 8) {
            System.out.println("Aug = 31 Days");
        } else if (n == 9) {
            System.out.println("Sep = 30 Days");
        } else if (n == 10) {
            System.out.println("Oct = 31 Days");
        } else if (n == 11) {
            System.out.println("Nov = 30 Days");
        } else if (n == 12) {
            System.out.println("Dec = 31 Days");
        } else {
            System.out.println("invalid month Number");
        }
    }
}
