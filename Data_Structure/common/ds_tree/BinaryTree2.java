package ds_tree;

public class BinaryTree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree2 binaryTree = new BinaryTree2();
        
        String strtree="- + / a * e f 0 0 b - 0 0 0 0 0 0 0 0 0 0 c d";//0��ʾû��ֵ��λ��
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
 
    //���ڵ�
    private Node root = null;
    private Node node = null;
    /**
     * ������
     *
     * ����ȫ�������ĸ�ʽ�����������������ڵ���0��䣩��
     * ����ȫ��������ÿһ���ڵ��0��ʼ���б�ţ�
     * ��ô��i���ڵ�����ӵı��Ϊ2*i+1���Һ���Ϊ2*i+2��
     *
     * */
//    void createTree(String strtree)
//    {
//        LinkQueue lQueue = new LinkQueue();
//        lQueue.initQueue();
//        /**
//         * ��ȫ�������е�i��Ľ��ĸ������Ϊ��1��i-1�������нڵ�ĸ�����
//         * ���Ը��ڵ�ĸ������ΪN-1����N��ʾ�ڵ����
//         * */
//        for(int parentIndex =0; parentIndex<strtree.split(" ").length/2;parentIndex++)
//        {
//            if(root == null)
//            {
//                root= new Node(strtree.split(" ")[parentIndex]);
//                //����
//                root.lchild = new Node(strtree.split(" ")[parentIndex*2+1]);
//                lQueue.enQueue(root.lchild);
//                //�Һ���
//                root.rchild = new Node(strtree.split(" ")[parentIndex*2+2]);
//                lQueue.enQueue(root.rchild);
//            }else
//            {
//                if(!lQueue.isEmpty() && parentIndex*2+1<strtree.split(" ").length)//���в���
//                {
//                    node = (Node) lQueue.deQueue();
//                    if(parentIndex*2+1<strtree.split(" ").length)
//                    {
//                        //����
//                        node.lchild = new Node(strtree.split(" ")[parentIndex*2+1]);
//                        lQueue.enQueue(node.lchild);
//                    }
//                    if(parentIndex*2+2<strtree.split(" ").length)
//                    {
//                        //�Һ���
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
//     * �������������
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
//     * �������������
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
//     * �������������
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
//     * ��ӡ������
//     * */
//    public void print()
//    {
//        System.out.print("���������");
//        preOrderTraverse(root);
//        System.out.print("\n���������");
//        inOrderTraverse(root);
//        System.out.print("\n���������");
//        postOrderTraverse(root);
//    }
//     
//    /**
//     * ���ʽڵ�
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
