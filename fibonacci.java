import java.util.Scanner;

public class fibonacci {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the req no.:");
        int n = input.nextInt();
        
        input.close();
        fibo(n);
    }

    public static void fibo(int num){
        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i < num; i++){

            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}
