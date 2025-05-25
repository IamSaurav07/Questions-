public class recursionKeypad {
/*
0 -> .
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz
*/

//O(4^n) : as at each level we can max of 4 possibility and n is string length

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
    public static void main(String[] args) {
        String val = "23";
        key(val, 0, "");
    }

    public static void key(String abc, int idx, String combination){
        if (idx == abc.length()) {
            System.out.println(combination);
            return;
        }

        int curr = abc.charAt(idx);
        String mapping = keypad[curr - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            key(abc, idx+1, combination+mapping.charAt(i));
        }
    }
}