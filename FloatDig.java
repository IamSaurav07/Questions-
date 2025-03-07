import java.util.Scanner;

public class FloatDig {
    public static void main(String[] args) {
        float[] number = new float[10];

        Scanner input = new Scanner(System.in);

        System.out.println("The float values are:");
        for(int i = 0; i< 10; i++){
            System.out.println("No."+ i + 1 + ":");
            number[i] = input.nextFloat();
        }
        
        input.close();

        System.out.println("The numbers you entered are:");
        for(float num : number){
            System.out.println(num);
        }
    }
}
