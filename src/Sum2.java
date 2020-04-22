import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sum2 {

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        int t1 = 9;
        System.out.println(Arrays.toString(onlyOneSol(arr1, t1)));
        // [0, 1]

        int[] arr2 = {1, 10, 2, 9, 5, 6, 17};
        int t2 = 11;
        printArr(multiSol(arr2, t2));
        // {[0, 1], [2, 3], [4, 5]}
    }

    static void printArr(ArrayList<int[]> arr) {
        for (int[] item: arr) {
            System.out.print(Arrays.toString(item) + "");
        }
    }

    static int[] onlyOneSol(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - i)) {
                return new int[] {map.get(target - i), i};
            }
            map.put(arr[i], i);
        }

        throw new IllegalArgumentException("cannot find any pair");
    }

    static ArrayList<int[]> multiSol(int[] arr, int target) {

        Arrays.sort(arr);
        int head = 0;
        int tail = arr.length - 1;
        ArrayList<int[]> result = new ArrayList<>();
        while (head < tail) {
            int sum = arr[head] + arr[tail];
            if (sum == target) {
                result.add(new int[] {head, tail});
                head += 1;
                tail -= 1;
                continue;
            }
            if (sum < target) {
                head += 1;
            } else {
                tail -= 1;
            }
        }
        return result;
    }
}
