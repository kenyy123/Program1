package ds_exercise1;

public class TreeSameRoot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSameRoot1 tree = new TreeSameRoot1();

		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        tree.root.left.right = new TreeNode(8);
		
		int data = tree.sameRoot(tree.root, 2, 5);
		
		System.out.println(data);
	}
	
	TreeNode root;
	
	public int sameRoot(TreeNode root, int a, int b){
		int min = 0;
		int max = 0;
		
		if(a < b){
			min = a; 
			max = b;
		}
		
		if(a > b){
			min = b; 
			max = a;
		}
		
		while(root != null){
			 if(root.data >= min && root.data <= max)  
		            return root.data;  
		     else if(root.data < min && root.data < max)  
		            root = root.right;  
		     else  
		            root = root.left;  
		}
		
		return root.data;
	}
	
	
	
//	http://www.cnblogs.com/chlde/archive/2012/10/26/2741380.html
//	http://blog.csdn.net/hackbuteer1/article/details/8022138
	///////////////////////
    // 二叉树结点的描述    
//    typedef struct BiTNode    
//    {    
//        char data;    
//        struct BiTNode *lchild, *rchild;      // 左右孩子    
//    }BinaryTreeNode;   
//      
//    // 节点只有左指针、右指针，没有parent指针，root已知  
//    BinaryTreeNode* findLowestCommonAncestor(BinaryTreeNode* root , BinaryTreeNode* a , BinaryTreeNode* b)  
//    {  
//        if(root == NULL)  
//            return NULL;  
//        if(root == a || root == b)  
//            return root;  
//        BinaryTreeNode* left = findLowestCommonAncestor(root->lchild , a , b);  
//        BinaryTreeNode* right = findLowestCommonAncestor(root->rchild , a , b);  
//        if(left && right)  
//            return root;  
//        return left ? left : right;  
//    }  
//	

}
