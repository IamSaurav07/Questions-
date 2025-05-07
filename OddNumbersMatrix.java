import java.util.Scanner;

public class OddNumbersMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Read matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find and display odd numbers with their positions
        System.out.println("Odd numbers and their positions (row, column):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 != 0) {  // Check if the element is odd
                    System.out.println("Element " + matrix[i][j] + " at (" + i + ", " + j + ")");
                }
            }
        }
        
        scanner.close();
    }
}

