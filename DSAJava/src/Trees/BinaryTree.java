package Trees;

class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {
	TreeNode root;

	// Inorder Traversal
	public void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		tree.inorder(tree.root); // Output: 4 2 5 1 3
	}
}
