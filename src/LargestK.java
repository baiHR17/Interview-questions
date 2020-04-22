
// 利用快排的思想输出第k大的数
// 有BUG！
public class LargestK {
    public static void main(String[] args) {
        int[] arr = {10, 12, 25, 1, 2, 17, 23};
        System.out.println(apply(arr, 3) == 17);
    }

    public static int apply(int[] num, int k) {
        return sort(num, 0, num.length - 1, k);
    }

    private static int sort(int[] num, int left, int right, int k) {
        if (left == right) {
            return num[left];
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

        if (right - i == k) {
            return num[i];
        } else if (right - i < k) {
            return sort(num, left, i - 1, k - (1 + right - i));
        } else {
            return sort(num, i + 1, right, k);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
