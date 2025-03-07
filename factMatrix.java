import java.util.Scanner;

public class factMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for(int i=0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = input.nextInt();
            }
        }


        for(int i=0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = factorial(matrix[i][j]);
            }
        }

        for(int i=0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 0; i< n; i++){
            fact *= i;
        }
        return fact;
    }

}
