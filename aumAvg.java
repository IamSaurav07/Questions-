import java.util.Scanner;

public class aumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=5;
        int sum = 0;

        System.out.println("Enter the" + n+ " values:");

        for(int i =1; i <=n; i++){
            System.out.print(i +"th value is:");
            int num = input.nextInt();
            sum +=num;
        }

        double avg = (double)sum/n;

        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+avg);
    }
}
