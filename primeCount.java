import java.util.ArrayList;
import java.util.Scanner;

public class primeCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the count of no.: ");
        int n = input.nextInt();


        int[] num = new int[n];

        System.out.println("Enter"+ n + "value :");
        for(int i = 0; i < n; i++){
            System.out.println("No." + i + " is");
            num[i] = input.nextInt();
        }

        ArrayList<Integer> oddNo = new ArrayList<>();
        ArrayList<Integer> evenNo = new ArrayList<>();
        ArrayList<Integer> primeNo = new ArrayList<>();

        for(int no : num){
            if (no % 2 == 0) {
                evenNo.add(no);
            }
            else{
                oddNo.add(no);
            }

            if (isPrime(no)) {
                primeNo.add(no);
            }
        }


        System.out.println("Count of Odd nos. are:" + oddNo.size());
        System.out.println("Count of Odd nos. are:" + oddNo);

        System.out.println("Count of Even nos. are:" + evenNo.size());
        System.out.println("Count of Even nos. are:" + evenNo);

        System.out.println("Count of Prime nos. are:" + primeNo.size());
        System.out.println("Count of Prime nos. are:" + primeNo);

        input.close();
    }
    
    
    public static boolean isPrime(int num) {
        if (num <= 0) {
            return false;
        }

        for(int i = 1; i < Math.sqrt(num);i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}