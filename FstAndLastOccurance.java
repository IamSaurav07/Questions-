public class FstAndLastOccurance {
    public static int first = -1;
    public static int last = -1;
 //TC : O(n)
    public static void main(String[] args) {
        String str = "hjsgacdggysag";
        occur(str,0, 'g');
    }

    public static void occur(String args, int idx, char elem) {

        if (idx == args.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = args.charAt(idx);
        if (curr == elem) {
            if (first == -1) {
                first = idx;
            }
            else{
                last = idx;
            }
        }

        occur(args, idx+1, elem);
        
    }

}
