public class pattern7 {
    public static void main(String[] args) {
        int n = 5;

        /*
        
        1
        10
        101
        1010
        10101
        
        */

        for(int i = 1; i <= n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
