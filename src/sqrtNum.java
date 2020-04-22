public class sqrtNum {

    public static void main(String[] args) {
        System.out.println(func(2));
    }

    static double func(int target) {
        double low = 0;
        double high = target * target;
        double res = high;

        while (Math.abs(res * res - target) > 1e-8) {
            res = (low + high) / 2;
            if (res * res < target) {
                low = res;
            } else if (res * res > target) {
                high = res;
            }
        }
        return res;
    }
}
