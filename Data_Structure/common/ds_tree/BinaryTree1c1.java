package ds_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTree1c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree1c1 btree = new BinaryTree1c1();
        int[] arr = new int[] {1,2,3,4,5,6,7};
        Node root = btree.initBinTree(arr);
        System.out.println("�������(�ֲ��ӡ)��");
        btree.trivalBinTree(root);
//        System.out.println("\n���������");
//        btree.preTrival(root);
//        System.out.println("\n���������");
//        btree.midTrival(root);
//        System.out.println("\n���������");
//        btree.afterTrival(root);
        
	}
	
	/**
	 * ����������ڵ�Ԫ��
	 * @author bubble
	 *
	 */
	class Node {   
	    public Node leftchild;
	    public Node rightchild;
	    public int data;

	    public Node(int data) {
	        this.data = data;
	    }

	}

	
	/**
     * ��һ��arry���鹹����һ����ȫ������
     * @param arr ��Ҫ����������
     * @return �������ĸ��ڵ�
     */
    public Node initBinTree(int[] arr) {
        if(arr.length == 1) {
            return new Node(arr[0]);
        }
        List<Node> nodeList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            nodeList.add(new Node(arr[i]));
        }
        int temp = 0;
        while(temp <= (arr.length - 2) / 2) {  //ע�����������±��Ǵ��㿪ʼ��
            if(2 * temp + 1 < arr.length) {
                nodeList.get(temp).leftchild = nodeList.get(2 * temp + 1);
            }
            if(2 * temp + 2 < arr.length) {
                nodeList.get(temp).rightchild = nodeList.get(2 * temp + 2);
            }
            temp++;
        }
        return nodeList.get(0);
       }
 
    /**
     * ��������������������ֲ��ӡ
     * @param root ���������ڵ�
     *
     */
     public void trivalBinTree(Node root) {
        Queue<Node> nodeQueue = new ArrayDeque<>(); 
        nodeQueue.add(root);
        Node temp = null;
        int currentLevel = 1;    //��¼��ǰ����Ҫ��ӡ�Ľڵ������
        int nextLevel = 0;//��¼��һ����Ҫ��ӡ�Ľڵ������
        while ((temp = nodeQueue.poll()) != null) {
            if (temp.leftchild != null) {
                nodeQueue.add(temp.leftchild);
                nextLevel++;
                
            }
            if (temp.rightchild != null) {
                nodeQueue.add(temp.rightchild);
                nextLevel++;
            }
            System.out.print(temp.data + " ");
            currentLevel--;
            if(currentLevel == 0) {
                System.out.println();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }
    

      /**
       * �������
       * @param root ���������ڵ�
       */
        public void preTrival(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preTrival(root.leftchild);
            preTrival(root.rightchild);
        }
        /**
         * �������
         * @param root ���������ڵ�
         */
        public void midTrival(Node root) {
            if(root == null) {
                return;
            }
            midTrival(root.leftchild);
            System.out.print(root.data + " ");
            midTrival(root.rightchild);
        }
        /**
         * �������
         * @param root ���������ڵ�
         */
        public void afterTrival(Node root) {
            if(root == null) {
                return;
                
            }
            afterTrival(root.leftchild);
            afterTrival(root.rightchild);
            System.out.print(root.data + " ");
        }
        
        
        

}
