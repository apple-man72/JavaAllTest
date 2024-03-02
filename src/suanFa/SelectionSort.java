package suanFa;

public class SelectionSort {
    public static void main(String[] args) {
//选择排序
        int[] arr = {2, 4, 1, 3, 5, 9, 8, 6, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                min = arr[min] > arr[j] ? j : min;
            }
            swap(arr, i, min);
        }
        print(arr);

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
