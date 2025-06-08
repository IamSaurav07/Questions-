public class recursionMoveEnd {

    // TC : O(n)
    public static void main(String[] args) {
        String arg = "hbzgxghxyraxx";
        move(arg,0,0,"");
    }

    public static void move(String args, int idx, int count, String newl) {
        if (idx == args.length()) {
            for(int i = 0; i < count; i++){
                newl += 'x';
            }
            System.out.print(newl);
            return;
        }

        int curr = args.charAt(idx); 

        if (curr == 'x') {
            count++;
            move(args, idx+1, count, newl);
        }
        else{
            newl += curr;
            move(args, idx+1, count, newl);
        }
    }
}
