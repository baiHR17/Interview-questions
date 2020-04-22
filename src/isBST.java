public class isBST {
    public static void main(String[] args) {
        LeafNode root = new LeafNode(10);
        root.setLeft(5);
        root.setRight(15);
        root._left.setLeft(3);
        root._left.setRight(12);

        // Should be false
        System.out.println(apply(root));
    }

    public static boolean apply(LeafNode T) {
        return isBSTHelper(T, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean isBSTHelper(LeafNode T, int min, int max) {
        if (T == null) {
            return true;
        } else if (T._val < min || T._val > max) {
            return false;
        } else {
            return isBSTHelper(T._left, min, T._val)
                    && isBSTHelper(T._right, T._val, max);
        }
    }
}
