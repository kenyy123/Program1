package huffmanTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class HuffmanTree<T> {
	
	
	 public static <T> HffNode<T> createTree(List<HffNode<T>> nodes){  
	        while(nodes.size() > 1){
//	        	Node node = new
	            Collections.sort(nodes);  
	            HffNode<T> left = nodes.get(nodes.size()-1);  
	            HffNode<T> right = nodes.get(nodes.size()-2);  
	            HffNode parent = new HffNode<T>(null, left.getWeight()+right.getWeight());  
	            parent.setLeft(left);  
	            parent.setRight(right);  
	            nodes.remove(left);  
	            nodes.remove(right);  
	            nodes.add(parent);  
	        }  
	        return nodes.get(0);  
	    }  
	      
	    public static <T> List<HffNode<T>> breadth(HffNode<T> root){  
	        List<HffNode<T>> list = new ArrayList<HffNode<T>>();  
	        Queue<HffNode<T>> queue = new ArrayDeque<HffNode<T>>();  
	          
	        if(root != null){  
	            queue.offer(root);  
	        }  
	          
	        while(!queue.isEmpty()){  
	            list.add(queue.peek());  
	            HffNode<T> node = queue.poll();  
	              
	            if(node.getLeft() != null){  
	                queue.offer(node.getLeft());  
	            }  
	              
	            if(node.getRight() != null){  
	                queue.offer(node.getRight());  
	            }  
	        }  
	        return list;  
	    }  
	
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        List<HffNode<String>> list = new ArrayList<HffNode<String>>();  
	        list.add(new HffNode<String>("a",7));  
	        list.add(new HffNode<String>("b",5));  
	        list.add(new HffNode<String>("c",4));  
	        list.add(new HffNode<String>("d",2));  
	          
	        HffNode<String> root = createTree(list);  
	        System.out.println(HuffmanTree.breadth(root));  
//	      System.out.println(list);  
	    }  
}
