package ds_tree;

public class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode(int x) { val = x; }
    
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
