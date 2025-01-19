import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no. to be checked:");
        int num = input.nextInt();

        int orgNo = num;
        int sum = 0;

        int temp = num;
        int digits = 0;

        while (temp!=0) {
            temp /= 10;
            digits ++;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        if (sum == orgNo) {
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }

        input.close();

    }
}