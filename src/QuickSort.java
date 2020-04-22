import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] num = {5, 1, 2, 4, 9, 2};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void sort(int[] num) {
        sort(num, 0, num.length - 1);
    }

    private static void sort(int[] num, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = num[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (num[j] >= pivot && i < j) {
                j--;
            }
            while (num[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                swap(num, i, j);
            }
        }
        swap(num, left, i);

        sort(num, left,i - 1);
        sort(num,i + 1, right);
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}