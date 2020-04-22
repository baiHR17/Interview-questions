import java.util.Collections;
import java.util.PriorityQueue;

/** 给定一个矩阵，横竖都是sorted，返回铺平之后第k小的元素。 */

public class MinKSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        System.out.println(func(matrix, k) == 13);
    }

    static int func(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                queue.add(matrix[i][j]);
                if (queue.size() >= k) {
                    return queue.poll();
                }
            }
        }
        return queue.poll();
    }
}
