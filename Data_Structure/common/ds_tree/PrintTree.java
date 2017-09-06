package ds_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/////////////////////////////
	//·ÇµÝ¹é
	public class Print1 {
	    ArrayList<ArrayList<Integer> > Print(TreeNode3 pRoot) {
	        ArrayList<ArrayList<Integer>> arrs = new ArrayList<ArrayList<Integer>>();
	        if(pRoot == null){
	            return arrs;
	        }
	        Queue<TreeNode3> q = new LinkedList<TreeNode3>();
	        q.add(pRoot);
	        int last=q.size(), count=0;
	        while(!q.isEmpty()){
	            count = 0;
	            last = q.size();
	            ArrayList<Integer> arr = new ArrayList<Integer>();
	            while(count<last){
	                TreeNode3 tr = q.poll();
	                count++;
	                arr.add(tr.val);
	                if(tr.left != null){
	                    q.add(tr.left);
	                }
	                if(tr.right != null){
	                    q.add(tr.right);
	                }
	            }
	            arrs.add(arr);
	        }
	        return arrs;
	    }  
	}
	
	/////////////////////////////////
	//µÝ¹é
	public class print2 {
	    ArrayList<ArrayList<Integer> > Print(TreeNode3 pRoot) {
	        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	        depth(pRoot, 1, list);
	        return list;
	    }

	    private void depth(TreeNode3 root, int depth, ArrayList<ArrayList<Integer>> list) {
	        if(root == null) return;
	        if(depth > list.size()) 
	            list.add(new ArrayList<Integer>());
	        list.get(depth -1).add(root.val);

	        depth(root.left, depth + 1, list);
	        depth(root.right, depth + 1, list);
	    }
	}
	
	/////////////////////////
	
	    public ArrayList<Integer> PrintFromTopToBottom3b(TreeNode3 root) {  
	        ArrayList<Integer> res = new  ArrayList<Integer>();  
	        Queue<TreeNode3> node =  new LinkedList<TreeNode3>();  
	        if(root == null){  
	            return res;  
	        }  
	        res.add(root.val);  
	        node.add(root);  
	        while(node.size()!=0){  
	            root = node.poll();  
	            if(root.left!=null){  
	                res.add(root.left.val);  
	                node.add(root.left);  
	            }  
	            if(root.right!=null){  
	                res.add(root.right.val);  
	                node.add(root.right);  
	            }  
	        }  
	        return res;  
	    } 
	    
//	    public static void main(String[] args) {  
//	        TreeNode t = new TreeNode();  
//	        TreeNode m = t.createTree();  
//	        t.inOrder(m);  
//	        System.out.println();  
//	        LevelPrintTree lpt = new LevelPrintTree();  
//	        ArrayList<Integer> a = lpt.PrintFromTopToBottom(m);  
//	        for(int i:a){  
//	            System.out.print(i+" ");  
//	        }  
//	    }  
  
	
	    ///////////////////////////////
	    public ArrayList<Integer> PrintFromTopToBottom3(TreeNode3 root) {  
	        
	        if (root == null) {  
//	            return result;  
	            }  
	         ArrayList<Integer> result=new ArrayList<Integer>();  
	        LinkedList<TreeNode3> queue=new LinkedList<TreeNode3>();  
	          
	        queue.offer(root);  
	        result.add(root.val);  
	        while(!queue.isEmpty()){  
	            int size=queue.size();  
	            for(int i=0;i<size;i++){  
	                TreeNode3 head=queue.poll();  
	                   
	            if(head.left!=null){  
	                queue.offer(head.left);  
	                result.add(head.left.val);    
	            }  
	            if(head.right!=null){  
	             queue.offer(head.right);    
	             result.add(head.right.val);    
	             }  
	            }  
	           
	        }  
	        return result;  
	    }  


    	
    	public ArrayList<Integer> PrintFromTopToBottom(TreeNode3 root) {
    	        ArrayList<Integer> list = new ArrayList<Integer>();
    	        if(root==null){
    	            return list;
    	        }
    	        Queue<TreeNode3> queue = new LinkedList<TreeNode3>();
    	        queue.offer(root);
    	        while (!queue.isEmpty()) {
    	            TreeNode3 treeNode = queue.poll();
    	            if (treeNode.left != null) {
    	                queue.offer(treeNode.left);
    	            }
    	            if (treeNode.right != null) {
    	                queue.offer(treeNode.right);
    	            }
    	            list.add(treeNode.val);
    	        }
    	        return list;
    	    }
    
    
	    
	    
	

}
