public class recursion5 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = qua(x,n);
        System.out.println(ans);
    }

    public static int qua(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if (n % 2 == 0) {
            return qua(x, n/2) * qua(x, n/2);
         }
        else{
            return qua(x, n/2) * qua(x, n/2) * x;
        }
    }
}
