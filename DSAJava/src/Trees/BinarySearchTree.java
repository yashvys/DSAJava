package Trees;

public class BinarySearchTree {
	TreeNode root;

	// Insert into BST
	public TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);

		tree.inorder(tree.root); // Output: 20 30 40 50 60 70 80
	}
}
