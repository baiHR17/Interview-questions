public class DFS {
    public static void main(String[] args) {
        LeafNode rt = new LeafNode(1);
        rt.setLeft(2);
        rt.setRight(3);
        rt._left.setRight(5);
        rt._left.setLeft(4);
        rt._left._right.setLeft(7);
        rt._left._right.setRight(8);
        rt._right.setRight(6);
        rt._right._right.setRight(9);
        DFS df = new DFS(rt);
        df.apply();
    }

    private static LeafNode _root;
    DFS(LeafNode rt) {
        _root = rt;
    }

    public static void apply() {
        helper(_root);
    }

    public static void helper(LeafNode rt) {
        if (rt == null) {
            return;
        }
        System.out.println(rt._val);
        helper(rt._left);
        helper(rt._right);
    }
}
