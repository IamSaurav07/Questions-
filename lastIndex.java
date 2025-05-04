import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String main = input.nextLine();

        System.out.println("Enter the substring:");
        String sub = input.nextLine();

        if (sub.isEmpty()) {
            System.out.println("The substring cannot be empty.");
        } else {
            
            int lastIndex = main.lastIndexOf(sub);
            
            if (lastIndex != -1) {
                System.out.println("The last occurrence of the substring is at index: " + lastIndex);
            } else {
                System.out.println("The substring was not found in the main string.");
            }
        }

        input.close();

    }
}
