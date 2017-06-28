package ds_tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree1a<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private TreeNode1<T> root;
	private List<TreeNode1> nodeList = new LinkedList<TreeNode1>();
	
	public BinaryTree1a(){
	
	}
	
	public BinaryTree1a(TreeNode1<T> root){
		this.root = root;
	}
	
	 public TreeNode1<T> buildTree(T[] array){
	        //将数组中的元素依次转换为TreeNode节点，存放于链表中
	        for(int i=0; i< array.length; i++){
	            nodeList.add(new TreeNode1(array[i]));  
	        }
	        //对前（array.length / 2 - 1）个父节点，按照父节点与孩子节点的数字关系建立完全二叉树
	        //对完全二叉树，按从上到下，从左到右的顺序依次编号0,1,2,3....N,则i>0的节点，其左孩子为（2*i+1），
	        //其右孩子为（2*i+2）
	        for(int j=0; j < (array.length/2-1);j++){
	            //左孩子
	            nodeList.get(j).setLeft(nodeList.get(j*2+1));
	            //右孩子
	            nodeList.get(j).setRight(nodeList.get(j*2+2));
	        }
	        //最后一个父节点：因为最后一个父节点可能没有右孩子，所以单独处理
	        int index = array.length/2 -1;
	        //左孩子
	        nodeList.get(index).setLeft(nodeList.get(index*2+1));
	        //右孩子：如果数组的长度为奇数才有右孩子
	        if(array.length % 2 == 1){
	            nodeList.get(index).setRight(nodeList.get(index*2+2));
	        }
	        root=nodeList.get(0); //设置根节点
	        return root;
	    }
	
}
