package ds_tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree1 {

	/**
	 * 二叉树按层遍历
	 * 
	 * 给定一颗二叉树头结点head, 按照以下格式答应
	 * 
	 *         1
	 *        / \
	 *       2   3
	 *      /   / \
	 *     4   5   6
	 *        / \
	 *       7   8
	 *  需要打印的格式为：
	 *  1
	 *  23
	 *  456
	 *  78x
	 *  @author zhangss 2017-07-12
	 * */
//	 http://www.cnblogs.com/zsslll/articles/7169938.html
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
        tree.setLeft(new TreeNode(2));
        tree.setRight(new TreeNode(3));
        
        tree.getLeft().setLeft(new TreeNode(4));
        
        tree.getRight().setLeft(new TreeNode(5));
        tree.getRight().setRight(new TreeNode(6));
        
        tree.getRight().getLeft().setLeft(new TreeNode(7));
        tree.getRight().getLeft().setRight(new TreeNode(8));
        
        PrintTree1.printTree(tree);
	}
	
	 public static void printTree(TreeNode tree){
	        Queue queue = new LinkedList();
	        TreeNode last = null;
	        TreeNode nlast = null;
	        TreeNode tmpNode = null;
	        queue.add(tree);
	        last = tree;
	        while(!queue.isEmpty()){
	            tmpNode = (TreeNode)queue.poll();
	            if(null != tmpNode.getLeft()){
	                queue.add(tmpNode.getLeft());
	                nlast = tmpNode.getLeft();
	            }
	                
	            if(null != tmpNode.getRight()){
	                queue.add(tmpNode.getRight());
	                nlast = tmpNode.getRight();
	            }
	            System.out.print(tmpNode.getVal());
	            if(tmpNode.equals(last)){
	                System.out.print("\n");
	                last = nlast;
	            }else{
	                continue;
	            }
	        }

	 }
	 

		 

}
