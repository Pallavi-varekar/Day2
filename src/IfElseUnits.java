import java.util.Scanner;

//Read a Number 1,10,100,1000 and display unit, ten hundred
public class IfElseUnits {
    public static void main(String[] args) {



   Scanner sc =new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        if(n < 10){
            System.out.println("enter number is ones: ");
        }
        else if( n < 100 ){
            System.out.println("enter number is tens ");
        }
        else if(n < 1000){
            System.out.println("enter number is hundread");
        }
        else if(n < 10000){
            System.out.println("enter num is thousand");

        }
        else {
            System.out.println("enter number is not valid");
        }
}}
