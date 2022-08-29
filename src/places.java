import java.util.Scanner;

public class places {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int n,u,t,h,o;
        System.out.println("enter 3 digit number: ");
        n=sc.nextInt();

        if(n>0){
            t=(n/1000)%100;
            System.out.println(" thousand place digit: "+t);
            h=(n/100)%10;
            System.out.println("hundread place digit: "+h);
            u=(n/10)%10;
            System.out.println("tens place digit: "+u);
            o=(n%10);
            System.out.println("once place digit: "+o);


        }
    }
}
