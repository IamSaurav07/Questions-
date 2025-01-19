import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the positive integer n:");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The input value should be a positive value!!");
        }
        else{
            long sum = 0;
            for(int i = 1; i <= n; i++){
                sum += (long) i*i*i;
            }
            System.out.println("The sum of cubes of first "+n+" numbers is: "+ sum);
        }

        
        input.close();
    }
}