public class recursionCheckSorted {
     //TC : O(n)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(check(arr,0));
    }

    public static boolean check(int[] abc, int idx) {
        if (idx == abc.length - 1) {
            return true;
        }

        if (abc[idx] < abc[idx + 1]) {
            return check(abc, idx+1);
        }
        else{
            return false;
        }

        
    }
}
