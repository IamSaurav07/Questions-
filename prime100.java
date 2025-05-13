import java.util.Scanner;

public class prime100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Prime nos from 1 to 100:");

        for(int i = 1; i <= 100; i++){
            int temp = 0;
            for(int j = 2; j < i; j++){
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            }
            
        }
    }
}
