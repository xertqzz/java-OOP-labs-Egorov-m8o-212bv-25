import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args){
        int[] numbers = {5, 6, 9, 8, 2, 1, 3, 4, 7};

        System.out.println("До сортировки: " + Arrays.toString(numbers));

        mergeSort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    private static void merge(int[] a, int[] b, int[] c){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < b.length && j < c.length){
            if (b[i] <= c[j]){
                a[k++] = b[i++];
            } else {
                a[k++] = c[j++];
            }
        }

        while (i < b.length){
            a[k++] = b[i++];
        }
        while (j < c.length){
            a[k++] = c[j++];
        }
    }

    private static void mergeSort(int[] a){
        if (a.length < 2){
            return;
        }
        int mid = a.length / 2;

        int[] b = Arrays.copyOfRange(a, 0, mid);
        int[] c = Arrays.copyOfRange(a, mid, a.length);

        mergeSort(b);
        mergeSort(c);

        merge(a, b, c);
    }
}
