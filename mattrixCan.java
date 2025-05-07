import java.util.*;

public class mattrixCan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row1 = 2, col1 = 3;
        int row2 = 3, col2 = 4;

        if (same(row1, col1, row2, col2)) {
            System.out.println("Two matrices can be multiplied");
        }
        else{
            System.out.println("two matrices can not be multiplied");
        }
    }

    public static boolean same(int row1, int col1, int row2, int col2){
        return col1 == row2;
    }
}
