
/** 求链表的中间值，快慢指针 */

public class LinkedListMid {

    public static void main(String[] args) {
        Node n9 = new Node(9, null);
        Node n8 = new Node(8, n9);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        System.out.println(func(n1));
    }

    static int func(Node head) {
        if (head == null) {
            return 0;
        }
        if (head._next == null) {
            return head._val;
        }

        Node ptrFast = head;
        Node ptrSlow = head;
        while (ptrFast != null) {
            if (ptrFast._next == null) {
                break;
            }
            ptrFast = ptrFast._next._next;
            ptrSlow = ptrSlow._next;
        }
        return ptrSlow._val;
    }
}
