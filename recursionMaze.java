public class recursionMaze {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int val = maze(0,0,n,m);
        System.out.println(val);
    }

    public static int maze(int r, int c, int n, int m) {
        if (r==n || c==m) {    //we reaches out of boundry 
            return 0;
        }

        if (r == n-1 && c == m-1) {  //We reach the exact position and move any futher
            return 1;
        }

        int down = maze(r+1, c, n, m);

        int up = maze(r, c+1, n, m);

        return down+up;
    }
}
