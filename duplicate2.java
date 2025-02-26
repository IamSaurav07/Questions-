import java.util.Arrays;

public class duplicate2 {
    public static void main(String[] args) {
        int[] arr = { 1,3,1,2,8,3,5,2,7,3,5,4,6,2,1};
        int n = arr.length;
        Arrays.sort(arr);

        int [] temp = new int[n];

        int j = 0;

        for(int i = 0; i<n -1; i++){
            if (arr[i] != arr[i+1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n-1];

        for(int i = 0; i< n; i++){
            System.out.print(temp[i]);
        }
    }
}
