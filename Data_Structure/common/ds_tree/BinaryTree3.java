package ds_tree;

public class BinaryTree3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,3,5,20,8,67,23,5,10,100};  
        TreeNode2 root = new TreeNode2();  
          
        root = createTree(root,a,Counter.count);  
        if(root == null)  
        {  
            System.out.println("Éµ¡Á");  
        }  
          
          
        traverse(root);  
	}
	
	public  static class Counter{  
	    public static int count=0;  
	}  
	
	public static TreeNode2 createTree(TreeNode2 root, int[]a, int i)  
    {  
        if(i < a.length)  
        {  
            if(a[i] == 0)  
            {  
                root = null;  
                  
            }  
            else  
            {  
                  
                TreeNode2 tl = new TreeNode2();  
                TreeNode2 tr = new TreeNode2();  
                root.setNode(a[i],createTree(tl,a,++(Counter.count)),createTree(tr,a,++(Counter.count)));  
                  
            }  
              
        }  
        return root;  
    }  
    public static void traverse(TreeNode2 root)  
    {  
        if(root != null)  
        {  
            System.out.println(root.getData());  
            traverse(root.getLchild());  
            traverse(root.getRchild());  
        }else{  
//            System.out.println(0);  
        }  
    }  
	
	

}
