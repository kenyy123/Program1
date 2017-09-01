package ds_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 root = new TreeNode2();
	        int[] a = { 1, 2, 3, 20, 10, 4, 50, 40, 5, 23, 31};
	        root = createBiTree(root, a, counter);
	     levelTraverse(root);
	}

	 public static int counter=0;  
	 public static TreeNode2 createBiTree(TreeNode2 root, int[] a, int i) {
	        if (i < a.length) {
	            if (a[i] == 0) {
	                root = null;
	            } else {
	            	TreeNode2 lchild = new TreeNode2();
	            	TreeNode2 rchild = new TreeNode2();
	                root.data = a[i];
	                root.lchild = createBiTree(lchild, a, ++counter);
	                root.rchild = createBiTree(rchild, a, ++counter);
	            }
	        }
	        return root;
	    }
	 
	  public static void visitTNode(TreeNode2 node) {
	        System.out.print(node.data + " ");
	    }
	  
	  public static void levelTraverse(TreeNode2 root) {
	        Queue<TreeNode2> queue = new LinkedList<TreeNode2>();
	        queue.offer(root);// 从根节点入队列
	        while (!queue.isEmpty()) {// 在队列为空前反复迭代
	        	TreeNode2 bitNode = queue.poll();// 取出队列首节点
	            visitTNode(bitNode);
	            if (bitNode.lchild != null)
	                queue.offer(bitNode.lchild);// 左孩子入列
	            if (bitNode.rchild != null)
	                queue.offer(bitNode.rchild);// 右孩子入列
	        }
	    }
	 
}
