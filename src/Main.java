import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        QuickSort st = new QuickSort();
        int[] num = {5, 1, 2, 4, 9, 2};
        st.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
