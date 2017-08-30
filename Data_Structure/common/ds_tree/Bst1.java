package ds_tree;

import java.util.ArrayDeque;
import java.util.Queue;

import ds_tree.Bst2.TreeNode;

public class Bst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};  
		Bst1 bTree = new Bst1();  
        for (int i = 0; i < a.length; i++) {  
            bTree.createTree(a[i]);  
        }  
        bTree.preOrder(bTree.root);
        bTree.trivalBinTree(bTree.root);
//        bTree.inOrder(bTree.root);  
//        bTree.postOrder(bTree.root);  
	}
	
	public class TreeNode{
     	public int keyValue;
     	public TreeNode leftNode;
     	public TreeNode rightNode;
     	
     
     
     	public TreeNode(int key){
     		this.keyValue = key;
     
     	}
	}
	
	public TreeNode root;
	
	 public Bst1(){ 
	        root  = null;  
	    }  
	
	
	
	public void createTree(int data){
		TreeNode node = new TreeNode(data);
		TreeNode currentNode;
		if(root == null){
			root = node;
			return;
		}else{
			currentNode= root;
//			TreeNode parentNode;
			
			while (true){ 
			
			if(data < currentNode.keyValue){				
				if(currentNode.leftNode == null){
					currentNode.leftNode =	node; 
				  return;
				}
				else{
					currentNode = currentNode.leftNode ;
				}
			
				
				
				
			}else{
//				currentNode = currentNode.rightNode;
				if(currentNode.rightNode == null){
					currentNode.rightNode = node;
				  return;
				}else{
					 currentNode = currentNode.rightNode; 
				}
			 }
			}
		}		
	}
	
	public void preOrder(TreeNode n1){
		if(n1 != null){  
			System.out.println(n1.keyValue);
			preOrder(n1.leftNode);
			preOrder(n1.rightNode);	
		}
	}

	
	public void trivalBinTree(TreeNode root) {
        Queue<TreeNode> nodeQueue = new ArrayDeque<>(); 
        nodeQueue.add(root);
        TreeNode temp = null;
        int currentLevel = 1;    //记录当前层需要打印的节点的数量
        int nextLevel = 0;//记录下一层需要打印的节点的数量
        while ((temp = nodeQueue.poll()) != null) {
            if (temp.leftNode != null) {
                nodeQueue.add(temp.leftNode);
                nextLevel++;
                
            }
            if (temp.rightNode != null) {
                nodeQueue.add(temp.rightNode);
                nextLevel++;
            }
            System.out.print(temp.keyValue + " ");
            currentLevel--;
            if(currentLevel == 0) {
                System.out.println();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }
}
