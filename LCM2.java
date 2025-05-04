import java.util.Scanner;

public class LCM2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first no: ");
        int a = input.nextInt();

        System.out.print("Enter second no: ");
        int b = input.nextInt();

        int gcd = findGCD(a,b);
        int lcm = (a * b) / gcd;

        input.close();
        System.out.println("LCM of " + a + " and " + b +" is: " + lcm);
    }

    public static int findGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = b % a;
            a = temp;
        }
        return a;
    }
}
