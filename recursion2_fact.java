public class recursion2_fact {
    public static void main(String[] args) {
        int n = 5;

        int fibo = fiboFun(n);

        System.out.println("Factorial of "+ n +" is "+ fibo);
    }

    public static int fiboFun(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }

        int a = fiboFun(num-1);
        int b = num * a;
        return b; 


    }
}
