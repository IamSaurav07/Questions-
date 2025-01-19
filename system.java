import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no of rows:");
        int rows = input.nextInt();

        System.out.println("Enter the no of column:");
        int column = input.nextInt();

        int[][] mattrix = new int[rows][column];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                mattrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the target element");
        int target = input.nextInt();

        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                if( mattrix[i][j] == target){
                    count++;
                }
            }
        }

        System.out.println("The number " + target + " occurs " + count + " times in the matrix.");

        input.close();
    }
}
