import java.util.Scanner;

//reads a matrix from the user, replaces all odd numbers with zero

public class oddMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int row = input.nextInt();

        System.out.print("Enter no of columns: ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                System.out.print("("+ i + "," + j + ") value is :" );
                matrix[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
