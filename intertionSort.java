public class intertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 8, 4, 7,3,2,0,9,4,6};

        int n = arr.length;

        for(int i = 1; i < n; i++){
            int current = arr[i];
            int j = i - 1;
            while ( j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
