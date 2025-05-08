import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no:");
        int num = input.nextInt();

        int t = num;
        int rev = 0;
        while (t != 0) {
            int rem = t % 10;
            rev = rev * 10 + rem;
            t = t/ 10;
        }
        
        if (num == rev) {
            System.out.println("No. is Pallindrome");
        }
        else{
            System.out.println("No. is not Pallindrome");
        }
    }
}
