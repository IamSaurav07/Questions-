public class recursionDuplicate {

    public static boolean[] map = new boolean[26];

    public static void dupli(String args, int idx, String newString) {
        if (idx == args.length()) {
            System.out.println(newString);
            return;
        }

        int curr = args.charAt(idx);

        if (map[curr - 'a']){
            dupli(args, idx+1, newString);
        }
        else{
            newString += (char)curr;
            map[curr - 'a'] = true;
            dupli(args, idx+1, newString);
        }
        
    }
    public static void main(String[] args) {
        String arg= "hgsdgjsjgg";
        dupli(arg,0,"");
    }
}
