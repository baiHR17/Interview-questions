

/** 一次交易，什么时候买，什么时候卖得到的收益最大。 */
public class StockMaxProfit {

    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println(func(price) == 5);
    }

    static int func(int[] arr) {
        int curMax = Integer.MIN_VALUE;
        int curMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curMax = Math.max(curMax, arr[i] - curMin);
            curMin = Math.min(curMin, arr[i]);
        }
        return curMax;
    }
}
