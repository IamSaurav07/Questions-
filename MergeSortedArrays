import java.util.Arrays;
import java.util.Random;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Define two sorted arrays
        int[] sortedArray1 = {1, 3, 5, 7};
        int[] sortedArray2 = {2, 4, 6, 8, 10};

        // Merge the arrays into a third unsorted array
        int[] unsortedArray = mergeAndShuffle(sortedArray1, sortedArray2);

        // Print the resulting unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
    }

    // Method to merge two sorted arrays and shuffle the result
    public static int[] mergeAndShuffle(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copy elements of array1 into mergedArray
        System.arraycopy(array1, 0, mergedArray, 0, length1);

        // Copy elements of array2 into mergedArray
        System.arraycopy(array2, 0, mergedArray, length1, length2);

        // Shuffle the merged array
        shuffleArray(mergedArray);

        return mergedArray;
    }

    // Method to shuffle an array
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap elements
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
