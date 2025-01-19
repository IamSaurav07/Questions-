/*import java.util.Scanner;

public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal value:");
        int num = sc.nextInt();

        String convertedVal = Integer.toHexString(num).toUpperCase();
        System.out.println("The hexadecimal equivalent is: " + convertedVal);

        sc.close();
    }
}
*/

/*import java.util.*;

public class DecimalToHexaDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hexadecimal value:");
        String val = sc.nextLine();

        int num = Integer.parseInt(val, 16);

        System.out.println("The decimal equivalent is: " + num);
        sc.close();
    }
}
*/

import java.util.*;

public class DecimalToHexaDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the octal value:");
        String val = sc.nextLine();

        int num = Integer.parseInt(val, 8);

        System.out.println("The decimal equivalent is: " + num);
        sc.close();
    }
}