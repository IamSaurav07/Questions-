public class pattern9 {
    public static void main(String[] args) {
        int n = 5;

        /* 
        
           1 
         1  2
        1  3  3
       1 4  6  4
      1 5 10 10 5

        */

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 0; j < i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
