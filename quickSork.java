public class quickSork {
    public static void main(String[] args) {
        int[] arr = { 9,32,6,5,2,1,8,1,2};
        int n = arr.length;

        quick(arr, 0, n-1);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quick(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIdx = partition(arr,start,end);

            quick(arr, start, pivotIdx-1);
            quick(arr, pivotIdx+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
