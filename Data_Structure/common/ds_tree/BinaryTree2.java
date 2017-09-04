package ds_tree;

public class BinaryTree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree2 binaryTree = new BinaryTree2();
        
        String strtree="- + / a * e f 0 0 b - 0 0 0 0 0 0 0 0 0 0 c d";//0表示没有值的位置
//        binaryTree.createTree(strtree);
         
//        binaryTree.print();
	}
	
	class Node
    {
        public Object data;
        public Node lchild;
        public Node rchild;
         
        public Node(Object data)
        {
            this.data = data;
            this.lchild = null;
            this.rchild = null;
        }
    }
 
    //根节点
    private Node root = null;
    private Node node = null;
    /**
     * 创建树
     *
     * 以完全二叉树的格式来创建（子树不存在的用0填充），
     * 对完全二叉树中每一个节点从0开始进行编号，
     * 那么第i个节点的左孩子的编号为2*i+1，右孩子为2*i+2。
     *
     * */
//    void createTree(String strtree)
//    {
//        LinkQueue lQueue = new LinkQueue();
//        lQueue.initQueue();
//        /**
//         * 完全二叉树中第i层的结点的个数最多为第1到i-1层上所有节点的个数和
//         * 所以父节点的个数最多为N-1个，N表示节点个数
//         * */
//        for(int parentIndex =0; parentIndex<strtree.split(" ").length/2;parentIndex++)
//        {
//            if(root == null)
//            {
//                root= new Node(strtree.split(" ")[parentIndex]);
//                //左孩子
//                root.lchild = new Node(strtree.split(" ")[parentIndex*2+1]);
//                lQueue.enQueue(root.lchild);
//                //右孩子
//                root.rchild = new Node(strtree.split(" ")[parentIndex*2+2]);
//                lQueue.enQueue(root.rchild);
//            }else
//            {
//                if(!lQueue.isEmpty() && parentIndex*2+1<strtree.split(" ").length)//队列不空
//                {
//                    node = (Node) lQueue.deQueue();
//                    if(parentIndex*2+1<strtree.split(" ").length)
//                    {
//                        //左孩子
//                        node.lchild = new Node(strtree.split(" ")[parentIndex*2+1]);
//                        lQueue.enQueue(node.lchild);
//                    }
//                    if(parentIndex*2+2<strtree.split(" ").length)
//                    {
//                        //右孩子
//                        node.rchild = new Node(strtree.split(" ")[parentIndex*2+2]);
//                        lQueue.enQueue(node.rchild);
//                    }
//                }else
//                {
//                    return;
//                }
//            }
//        }
//    }
//     
//    /**
//     * 先序遍历二叉树
//     * */
//    void preOrderTraverse(Node node)
//    {
//        if(node == null)
//        {
//            return;
//        }
//        visit(node);
//        preOrderTraverse(node.lchild);
//        preOrderTraverse(node.rchild);
//    }
//    /**
//     * 中序遍历二叉树
//     * */
//    void inOrderTraverse(Node node)
//    {
//        if(node == null)
//        {
//            return;
//        }
//        inOrderTraverse(node.lchild);
//        visit(node);
//        inOrderTraverse(node.rchild);
//    }
//    /**
//     * 后序遍历二叉树
//     * */
//    void postOrderTraverse(Node node)
//    {
//        if(node == null)
//        {
//            return;
//        }
//        postOrderTraverse(node.lchild);
//        postOrderTraverse(node.rchild);
//        visit(node);
//    }
// 
//    /**
//     * 打印二叉树
//     * */
//    public void print()
//    {
//        System.out.print("先序遍历：");
//        preOrderTraverse(root);
//        System.out.print("\n中序遍历：");
//        inOrderTraverse(root);
//        System.out.print("\n后序遍历：");
//        postOrderTraverse(root);
//    }
//     
//    /**
//     * 访问节点
//     * */
//    private void visit(Node node)
//    {
//        if(!node.data.equals("0"))
//        {
//            System.out.print(node.data+" ");
//        }
//    }
//}

}
