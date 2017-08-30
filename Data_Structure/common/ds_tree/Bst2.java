package ds_tree;

import java.util.ArrayDeque;
import java.util.Queue;

import ds_tree.Bst1.TreeNode;

public class Bst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};  
		Bst2 b1 = new Bst2(1);  
        for (int i = 0; i < a.length; i++) {  
            b1.addNode(a[i]);;  
        }  
        b1.inOrder(b1.root);  
//        bTree.inOrder(bTree.root);  
//        bTree.postOrder(bTree.root);  
	}
	
//	http://blog.csdn.net/lingzhm/article/details/44497191
	public class TreeNode {
		public int iData;          //����������  
	    public TreeNode leftChild; //���ָ�����ӵ�����  
	    public TreeNode rightChild;//���ָ���Һ��ӵ�����  
	      
	    public TreeNode(int iData){//���췽������ʼ�����������  
	        this.iData = iData;  
	    }  
	    public void displayNode(){ //������ֵ  
	        System.out.print(" "+this.iData);  
	    }  
	}	
//	public TreeNode val;
//	
//	 public Bst2(){  
//	        root = null;  
//	    }  
	
	 public TreeNode root;  
     
	    public Bst2(int iData){  
	        root = new TreeNode(iData);  
	    } 

//	public void addNode(int num) {
//	        if (num < this.val) {
//	            if (this.left != null) {
//	                this.left.addNode(num);
//	            } else {
//	                this.left = new TreeNode(num);
//	            }
//	            return;
//	        }
//	 
//	        if (this.right != null) {
//	            this.right.addNode(num);
//	        } else {
//	            this.right = new TreeNode(num);
//	        }
//	        return;
//	 }
	
	
//	public void traverseInOrder(){
//		 if (this.left != null) {
//	            this.left.traverseInOrder();
//	        }
//	        System.out.println(this.val);
//	        if (this.right != null) {
//	            this.right.traverseInOrder();
//	        }
//	}  

	
    public void addNode(int iData){  
        TreeNode node = new TreeNode(iData);  
        TreeNode current ;  
        if(root == null){  
            root = node;  
            return;  
        }  
        else{  
            current = root;  
            while(true){  
                if(iData >= current.iData){  
                    if(current.rightChild == null){  
                        current.rightChild = node;  
                        return;/////�ҵ�����λ�þͲ��룬���ҷ��ز���ִ��  
                    }else{  
                        current = current.rightChild;  
                    }  
                }else{  
                    if(current.leftChild == null){  
                        current.leftChild = node;  
                        return;////�ҵ�����λ�þͲ��룬���ҷ��ز���ִ��  
                    }else{  
                        current = current.leftChild;  
                    }  
                }// end if  
            }// end while  
        }// end root is not null  
    }  
    
    public void inOrder(TreeNode node){//������������������ĵݹ�ʵ�֣�  
        if(node != null){  
            inOrder(node.leftChild);  
            System.out.print(" "+node.iData);  
            inOrder(node.rightChild);  
        }  
    }  
    public void preOrder(TreeNode node){  
        if(node != null){  
            System.out.print(" "+node.iData);  
            preOrder(node.leftChild);  
            preOrder(node.rightChild);  
        }  
    }  
    public void postOrder(TreeNode node){  
        if(node != null){  
            postOrder(node.leftChild);  
            postOrder(node.rightChild);  
            System.out.print(" "+node.iData);  
        }  
    }  
    
    public void trivalBinTree(TreeNode root) {
        Queue<TreeNode> nodeQueue = new ArrayDeque<>(); 
        nodeQueue.add(root);
        TreeNode temp = null;
        int currentLevel = 1;    //��¼��ǰ����Ҫ��ӡ�Ľڵ������
        int nextLevel = 0;//��¼��һ����Ҫ��ӡ�Ľڵ������
        while ((temp = nodeQueue.poll()) != null) {
            if (temp.leftChild != null) {
                nodeQueue.add(temp.leftChild);
                nextLevel++;
                
            }
            if (temp.rightChild != null) {
                nodeQueue.add(temp.rightChild);
                nextLevel++;
            }
            System.out.print(temp.iData + " ");
            currentLevel--;
            if(currentLevel == 0) {
                System.out.println();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }


}