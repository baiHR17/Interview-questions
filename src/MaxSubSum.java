/** 最大字串和 Kadane's algorithm
 * 思想就是终止于i位置的最大字串和要么是arr[i], 要么是终止于i - 1的字串最大和+arr[i]
 * 不断更新curMax, 如果比gloabl大，就更新一下global*/
public class MaxSubSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, -9, 5, 6, -3, 7, 8, -89, 10};
        System.out.println(func(arr) == 23);
    }

    static int func(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int curMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curMax = Math.max(arr[i], curMax + arr[i]);
            if (curMax > globalMax) {
                globalMax = curMax;
            }
        }
        return globalMax;
    }
}
