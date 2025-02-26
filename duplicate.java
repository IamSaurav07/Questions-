import java.util.Arrays;

public class duplicate{
	public static void main(String[] args) {
	    int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7};

		Arrays.sort(arr);

		int fin = isDupli(arr);

		for(int i = 0; i< fin; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static int isDupli(int[] arr){
		int len = arr.length;

		if (len == 0) {
			return 0;
		}

		int index = 0;

		for(int i = 1; i< len; i++){
			if (arr[i] != arr[index]) {
				index++;
				arr[index] = arr[i];
			}
		}
		return index + 1;
	}
}