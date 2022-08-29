import java.util.Scanner;

public class UnitsTens {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int n,u,t,h;
        System.out.println("enter 3 digit number: ");
        n=sc.nextInt();

        u = n%10;
        t= n%100/10;
        h= n%1000/100;
        System.out.println("the number is unit place: "+u);
        System.out.println("the number is tens place: "+t);
        System.out.println("the number is hundread place: "+u);



    }
}
