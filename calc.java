import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
                case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Can't divide by 0");
                    valid = false;
                }
                else{
                    result = num1 / num2;
                }break;

            default:
                System.out.println("Error: not valid operation.....");
                valid = false;
                break;
        }

    }
}
