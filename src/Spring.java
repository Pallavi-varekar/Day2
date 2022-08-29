//2. Write a program SpringSeason.java that takes two int values m and d from the command line and prints
// true if day d of
// month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
public class Spring {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        if (month == 3 && day >= 20 && day <= 31) {
            System.out.println("true");
        } else if (month == 4 && day >= 1 && day <= 30) {
            System.out.println("true");
        } else if (month == 5 && day >= 1 && day <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
