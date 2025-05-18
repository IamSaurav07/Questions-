public class recursionAllPermutation {
    //O(n!) :(first pos: (n) possibility) * (sec pos: (n-1) possibility) * (third pos: (n-2) possibility)

    public static void main(String[] args) {
        String str = "abc";
        permu(str,"");
    }

    public static void permu(String args, String combination) {
        if (args.length() == 0) {
            System.out.println(combination);
            return;
        }
        
        for(int i = 0; i < args.length(); i++){
            char curr = args.charAt(i);
            String newgo = args.substring(0, i) + args.substring(i+1);
            permu(newgo, combination+curr);
        }
    }
}
