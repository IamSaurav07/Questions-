public class recursionStringRev {

    //TC : O(n)
    public static void main(String[] args) {
        String name = "apple";

        reverse(name, name.length()-1);
    }

    public static void reverse(String name, int n) {
        if (n == 0) {
            System.out.print(name.charAt(n));
            return;
        }

        System.out.print(name.charAt(n));
        reverse(name, n-1);
    }
}
