//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
import java.util.Scanner;

public class ForLoopNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=a; i++) {
            sum +=i;
        }
        System.out.println("The result is: "+sum);
    }
}
