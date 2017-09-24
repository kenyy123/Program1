package ds_exercise1;


import java.util.ArrayList;
import java.util.List;

public class TreeSameRoot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSameRoot2  tree = new TreeSameRoot2();
		
		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        tree.root.left.right = new TreeNode(8);
		
		tree.root = tree.getCommonRoot(tree.root, tree.root.left.left, tree.root.right);
		
		System.out.println(tree.root.data);
	}

	
	TreeNode root;
	
	public boolean getPath(TreeNode root,TreeNode decNode,List<TreeNode> array){
        boolean findResult = false;
        if(null != root){
            if(root == decNode){
                array.add(root);
                findResult = true;
            }
            if(!findResult&& root.left!=null){
                findResult = this.getPath(root.left, decNode, array);
                if(findResult){
                    array.add(root);
                }
            }
            if(!findResult&& root.right!=null){
                findResult = this.getPath(root.right, decNode, array);
                if(findResult){
                    array.add(root);
                }
            }
        }
        return findResult;
    }

	
	
//	http://www.cnblogs.com/chlde/archive/2012/10/26/2741380.html
	public TreeNode getCommonRoot(TreeNode root, TreeNode a, TreeNode b) {
		// TODO Auto-generated method stub 
	 TreeNode common = null;
	 List<TreeNode> pathA = new ArrayList<TreeNode>();
	 List<TreeNode> pahtB = new ArrayList<TreeNode>();
	 getPath(root, a, pathA);
	 getPath(root, b, pahtB);
	 for(TreeNode NodeA:pathA){
		 for(TreeNode NodeB:pahtB){
			 if(NodeA == NodeB){
				 common = NodeA;
				 break;
			 }
		 }
		 if(null!=common){
			 break;
		 }
	 }
	 return common;
	}
	
}
