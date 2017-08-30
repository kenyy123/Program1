package ds_tree;

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
		public int iData;          //结点的数据项  
	    public TreeNode leftChild; //结点指向左孩子的引用  
	    public TreeNode rightChild;//结点指向右孩子的引用  
	      
	    public TreeNode(int iData){//构造方法，初始化结点数据项  
	        this.iData = iData;  
	    }  
	    public void displayNode(){ //输出结点值  
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
                        return;/////找到插入位置就插入，并且返回不再执行  
                    }else{  
                        current = current.rightChild;  
                    }  
                }else{  
                    if(current.leftChild == null){  
                        current.leftChild = node;  
                        return;////找到插入位置就插入，并且返回不再执行  
                    }else{  
                        current = current.leftChild;  
                    }  
                }// end if  
            }// end while  
        }// end root is not null  
    }  
    
    public void inOrder(TreeNode node){//中序遍历二叉搜索树的递归实现；  
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
    
    


}