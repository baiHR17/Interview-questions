public class Node {

    Node _next;
    int _val;

    Node(int val, Node next) {
        _next = next;
        _val = val;
    }

    Node getNext() {
        return _next;
    }

    int getVal() {
        return _val;
    }
}
