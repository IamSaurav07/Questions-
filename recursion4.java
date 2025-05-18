public class recursion4 {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;

        int ans = sum(x,n);
        System.out.println(ans);
    }

    public static int sum(int num1, int num2) {
        if (num1 == 0) {
            return 0;
        }
        if (num2 == 0) {
            return 1;
        }

        int a = sum(num1, num2-1); 
        int b = num1 * a;
        return b;
    }
}
