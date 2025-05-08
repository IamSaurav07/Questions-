public class pattern2 {
    public static void main(String[] args) {

        /*Butterfly_pattern


         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      * 
         

        */
        int n = 5;

        //upper half
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            int temp = 2 * (n-i);
            for(int j = 1; j <= temp; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //down half
        for(int i = n; i >= 1; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            int temp = 2 * (n-i);
            for(int j = 1; j <= temp; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
