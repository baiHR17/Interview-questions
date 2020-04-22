public class LeafNode {

    LeafNode _right;
    LeafNode _left;
    int _val;

    LeafNode(int val) {
        _right = null;
        _left = null;
        _val = val;
    }

    LeafNode getLeft() {
        return _left;
    }

    LeafNode getRight() {
        return _right;
    }

    void setLeft(int val) {
        if (_left == null) {
            _left = new LeafNode(val);
        } else {
            _left._val = val;
        }
    }

    void setRight(int val) {
        if (_right == null) {
            _right= new LeafNode(val);
        } else {
            _right._val = val;
        }
    }


    void setLeft(LeafNode le) {
        _left = le;
    }

    void setRight(LeafNode ri) {
        _right = ri;
    }

    int getVal() {
        return _val;
    }
}
