import java.util.Arrays;

public class insertionSorter {
    public static void main(String args[]){
        int[] numbers = {5, 4, 9, 10, 27, 1, 6, 7, 3};
        System.out.println("До сортировки: " + Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

