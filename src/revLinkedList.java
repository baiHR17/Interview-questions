/** 1-2-3-4, 4-3-2-1 */
public class revLinkedList {
    public static void main(String[] args) {
        Node n8 = new Node(8, null);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        Node rev = rev(n1);
        printList(rev);
    }

    static Node rev(Node head) {
        if (head == null) {
            return null;
        }

        if (head._next == null) {
            return head;
        }

        Node ptr = head._next;
        Node end = rev(ptr);
        ptr._next = head;
        head._next = null;
        return end;
    }


    static void printList(Node lis) {
        if (lis == null) {
            return;
        }

        Node ptr = lis;

        if (ptr._next == null) {
            System.out.println(ptr._val);
            return;
        }

        while (ptr != null) {
            System.out.print(ptr._val + " ");
            ptr = ptr._next;
        }
    }
}
