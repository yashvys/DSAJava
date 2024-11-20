package Trees;

import java.util.*;

public class LevelOrderTraversal {
	TreeNode root;

	// Level Order Traversal
	public void levelOrder(TreeNode root) {
		if (root == null)
			return;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.data + " ");
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		tree.levelOrder(tree.root); // Output: 1 2 3 4 5
	}
}
