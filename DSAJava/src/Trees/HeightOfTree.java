package Trees;

public class HeightOfTree {
	TreeNode root;

	// Find the height of the tree
	public int height(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public static void main(String[] args) {
		HeightOfTree tree = new HeightOfTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);

		System.out.println("Height of Tree: " + tree.height(tree.root)); // Output: 3
	}
}
