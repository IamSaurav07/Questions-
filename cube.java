import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no.of terms:");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            int num = input.nextInt();
            System.out.print(num * num * num);
        }

    }
}
