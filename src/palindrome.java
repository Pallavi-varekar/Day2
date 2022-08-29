import java.util.Scanner;

// Write a Program to find Palindrome Number
public class palindrome {
    public static void main(String[] args) {
        int n,r,rev=0;
        int m;
        System.out.println("Enter any number");

        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        m=n;
        while (n!=0) {
            r = n % 10;
            rev=rev*10+r;
            System.out.print(r);
            n = n / 10;
        }
        if (m==rev)
            System.out.println(" the number is palindrome");
        else
            System.out.println("  not palindrome");
    }
}
