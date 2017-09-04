package ds_tree;

public class TreeNode1<T> {

	public T val;
	public TreeNode1<T> left;
	public TreeNode1<T> right;
	
	public TreeNode1(){}
	
	public TreeNode1(T val){
		this.val = val;
	}
	
	public TreeNode1(T val, TreeNode1<T> left, TreeNode1<T> right){
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public TreeNode1<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode1<T> left) {
		this.left = left;
	}

	public TreeNode1<T> getRight() {
		return right;
	}

	public void setRight(TreeNode1<T> right) {
		this.right = right;
	}
	
}
