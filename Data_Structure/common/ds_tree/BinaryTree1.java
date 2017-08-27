package ds_tree;

public class BinaryTree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 String str = "[3,9,20,null,null,15,7]";
//		 TreeNode node = TreeNode.mkTree(str);
//		 System.out.println("Binary Tree.");
		
		int[] a = {100,4,12,45,21,6,111};  
        BinaryTree1 bTree = new BinaryTree1();  
        for (int i = 0; i < a.length; i++) {  
            bTree.buildTree(bTree.root, a[i]);  
        }  
//        bTree.preOrder(bTree.root);  
        bTree.inOrder(bTree.root);  
//        bTree.postOrder(bTree.root);  
	}
	
	 private Node root;  
     
	    /** 
	     *  
	     * �ڲ��ڵ��� 
	     * @author yhh 
	     */  
	    private class Node{  
	        private Node left;  
	        private Node right;  
	        private int data;  
	        public Node(int data){  
	            this.left = null;  
	            this.right = null;  
	            this.data = data;  
	        }  
	    }  
	      
	    public BinaryTree1(){  
	        root = null;  
	    }  
	      
	    /** 
	     * �ݹ鴴�������� 
	     * @param node 
	     * @param data 
	     */  
	    public void buildTree(Node node,int data){  
	        if(root == null){  
	            root = new Node(data);  
	        }else{  
	            if(data < node.data){  
	                if(node.left == null){  
	                    node.left = new Node(data);  
	                }else{  
	                    buildTree(node.left,data);  
	                }  
	            }else{  
	                if(node.right == null){  
	                    node.right = new Node(data);  
	                }else{  
	                    buildTree(node.right,data);  
	                }  
	            }  
	        }  
	    }  
	      
	    /** 
	     * ǰ����� 
	     * @param node 
	     */  
	    public void preOrder(Node node){  
	        if(node != null){  
	            System.out.println(node.data);  
	            preOrder(node.left);  
	            preOrder(node.right);  
	        }  
	    }  
	      
	    /** 
	     * ������� 
	     * @param node 
	     */  
	    public void inOrder(Node node){  
	        if(node != null){  
	            inOrder(node.left);  
	            System.out.println(node.data);  
	            inOrder(node.right);  
	        }  
	    }  
	      
	    /** 
	     * ������� 
	     * @param node 
	     */  
	    public void postOrder(Node node){  
	        if(node != null){  
	            postOrder(node.left);  
	            postOrder(node.right);  
	            System.out.println(node.data);  
	        }  
	    }  
	
	
	
	
}
