package ds_mshundred;

public class Ds01ConverToLinklist {
	private Node root;  
	  
    private class Node {  
        private Node left;  
        private Node right;  
        private int data;  
   
         public Node(int data) {  
             this.left = null;  
             this.right = null;  
             this.data = data;  
         }  
     }  
   
     public Ds01ConverToLinklist() {  
         root = null;  
    }  
  
    public void buildTree(Node node, int data) {  
        if (root == null) {  
            root = new Node(data);  
        } else {  
            if (data < node.data) {  
                if (node.left == null) {  
                    node.left = new Node(data);  
                } else {  
                    buildTree(node.left, data);  
                }  
            } else {  
                if (node.right == null) {  
                    node.right = new Node(data);  
                } else {  
                    buildTree(node.right, data);  
                }  
            }  
        }  
    }  
  
    /** 
     * 将二叉树转换为双向链表 
     */  
    private Node last = null;;  
  
    public void ConvertNode(Node node) {  
  
        if (node == null)  
            return;  
  
          if (node.left != null)  
              ConvertNode(node.left);  
              node.left = last;  
    
          if (last != null)  
              last.right = node;  
              last = node;  
          if (node.right != null)  
              ConvertNode(node.right);  
    
      }  
    
      public void print(Node node) {    
          Node r = node;  
          while (r != null) {  
              System.out.print(r.data + " ");  
              r = r.right;  
          }  
      }  
    
      public static void main(String[] args) {  
          int[] a = { 2, 4, 12, 45, 21, 6, 111 };  
          Ds01ConverToLinklist bTree = new Ds01ConverToLinklist();  
          for (int i = 0; i < a.length; i++) {  
              bTree.buildTree(bTree.root, a[i]);  
          }  
          bTree.ConvertNode(bTree.root);  
          bTree.print(bTree.root);  
    
      }  
}
