public class pattern1 {
    public static void main(String[] args) {

        
       
        /* Pattern 1


        *****
        *****
        *****
        *****
         
        int n = 4;
        int m = 5;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /*pattern 2

         *****
         *   *
         *   *
         *****

        int n = 4;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= m; j++){
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
        */

        /* Pattern 3 

        *
        **
        ***
        ****
        *****

         int n = 5;

         for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

        */

        /* Pattern_4
    
        *****
        ****
        ***
        **
        *

        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        */

        /* Pattern_5
        
             *
            **
           ***
          ****
         *****

          int n = 5;

         for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
         }
         */

        /* pattern_6

        1
        12
        123
        1234
        12345      
        
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */


        /* pattern_7

        12345
        1234 
        123  
        12
        1   
        
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */


        /* pattern_7

        1
        23
        456
        78910   
        
        int n = 5;
        int temp=1;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
        */

        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        


        



        
        
        
         

    }
}
