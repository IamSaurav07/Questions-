public class recursion {
    public static void main(String[] args) {
        sum(1,5,0);
    }

    public static void sum(int i, int n, int sum) {
        if (n == i) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1, n, sum);
    }
}
