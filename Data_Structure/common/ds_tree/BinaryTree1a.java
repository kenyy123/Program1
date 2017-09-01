package ds_tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree1a<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private TreeNode1<T> root;
	private List<TreeNode1> nodeList = new LinkedList<TreeNode1>();
	
	public BinaryTree1a(){
	
	}
	
	public BinaryTree1a(TreeNode1<T> root){
		this.root = root;
	}
	
	 public TreeNode1<T> buildTree(T[] array){
	        //�������е�Ԫ������ת��ΪTreeNode�ڵ㣬�����������
	        for(int i=0; i< array.length; i++){
	            nodeList.add(new TreeNode1(array[i]));  
	        }
	        //��ǰ��array.length / 2 - 1�������ڵ㣬���ո��ڵ��뺢�ӽڵ�����ֹ�ϵ������ȫ������
	        //����ȫ�������������ϵ��£������ҵ�˳�����α��0,1,2,3....N,��i>0�Ľڵ㣬������Ϊ��2*i+1����
	        //���Һ���Ϊ��2*i+2��
	        for(int j=0; j < (array.length/2-1);j++){
	            //����
	            nodeList.get(j).setLeft(nodeList.get(j*2+1));
	            //�Һ���
	            nodeList.get(j).setRight(nodeList.get(j*2+2));
	        }
	        //���һ�����ڵ㣺��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե�������
	        int index = array.length/2 -1;
	        //����
	        nodeList.get(index).setLeft(nodeList.get(index*2+1));
	        //�Һ��ӣ��������ĳ���Ϊ���������Һ���
	        if(array.length % 2 == 1){
	            nodeList.get(index).setRight(nodeList.get(index*2+2));
	        }
	        root=nodeList.get(0); //���ø��ڵ�
	        return root;
	    }
	
}
