public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 8, 4, 7,3,2,0,9,4,6};

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
