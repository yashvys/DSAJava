package linkedlists;

public class ReverseLinkedList {
    Node head;

    // Reverse the list
    public Node reverse(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Display the list
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Original List:");
        list.display(list.head);
        list.head = list.reverse(list.head);
        System.out.println("Reversed List:");
        list.display(list.head);
    }
}
