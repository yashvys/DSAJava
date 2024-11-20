package linkedlists;

public class MergeSortedLists {
	Node head;

	// Merge two sorted lists
	public Node merge(Node l1, Node l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		if (l1.data < l2.data) {
			l1.next = merge(l1.next, l2);
			return l1;
		} else {
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}

	public void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		MergeSortedLists list = new MergeSortedLists();
		Node l1 = new Node(1);
		l1.next = new Node(3);
		l1.next.next = new Node(5);

		Node l2 = new Node(2);
		l2.next = new Node(4);
		l2.next.next = new Node(6);

		Node merged = list.merge(l1, l2);
		list.display(merged);
	}
}
