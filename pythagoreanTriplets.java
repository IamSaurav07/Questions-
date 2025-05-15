import java.util.Scanner;

public class pythagoreanTriplets {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter the value of n:");
    int n = input.nextInt();

    for(int i = 0; i< n; i++){
        for(int j = i+1; j <= n; j++){
            for(int k = j+1; k <= n; k++){
                if ((i*i)+(j*j) == (k*k)) {
                    System.out.println(i+"^2 + " + j + "^2 =" + k +"^2");
                }
            }
        }
    }
    input.close();
 }
}
