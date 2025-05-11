import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no the check prime no.");
        int n = input.nextInt();

        if (check(n)) {
            System.out.println("Given no is prime.");
        }
        else{
            System.out.println("Given no is not prime.");
        }
    }

    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
