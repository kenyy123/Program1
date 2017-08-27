package ds_tree;


public class TreeNode2 {
	 int data;  
     TreeNode2 lchild ;  
     TreeNode2 rchild ;  
    public int getData()  
    {  
        return data;  
    }  
    public TreeNode2 getLchild()  
    {  
        return lchild;  
    }  
    public TreeNode2 getRchild()  
    {  
        return rchild;  
    }  
  
    public TreeNode2(){  
          
    }  
    
    public void setNode(int data,TreeNode2 lc,TreeNode2 rc){  
        this.data = data;  
        lchild = lc;  
        rchild = rc;  
    }  
      
}
