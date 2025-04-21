import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no. of elements:");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input !!!");
            return;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i < num; i++){
            int value = input.nextInt();

            if (value > high) {
                high = value;
            }
            if (value < low) {
                low = value;
            }
        }

        int sum = high + low;

        System.out.println("Highest Value is "+ high +" And lowest value is "+ low + " And there sum is" + sum);

    }
}
