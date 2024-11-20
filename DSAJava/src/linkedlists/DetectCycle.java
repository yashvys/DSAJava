package linkedlists;

public class DetectCycle {
    Node head;

    // Detect Cycle
    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle list = new DetectCycle();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = list.head.next; // Creates a cycle

        System.out.println("Cycle detected: " + list.hasCycle(list.head));
    }
}
