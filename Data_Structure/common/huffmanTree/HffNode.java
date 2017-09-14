package huffmanTree;

public class HffNode<T> implements Comparable<HffNode<T>> {
	    private T data;  
	    private double weight;  
	    private HffNode<T> left;  
	    private HffNode<T> right;  
	      
	    public HffNode(T data, double weight){  
	        this.data = data;  
	        this.weight = weight;  
	    }  
	      
	    public T getData() {  
	        return data;  
	    }  
	  
	    public void setData(T data) {  
	        this.data = data;  
	    }  
	  
	    public double getWeight() {  
	        return weight;  
	    }  
	  
	    public void setWeight(double weight) {  
	        this.weight = weight;  
	    }  
	  
	    public HffNode<T> getLeft() {  
	        return left;  
	    }  
	  
	    public void setLeft(HffNode<T> left) {  
	        this.left = left;  
	    }  
	  
	    public HffNode<T> getRight() {  
	        return right;  
	    }  
	  
	    public void setRight(HffNode<T> right) {  
	        this.right = right;  
	    }  
	  
	    @Override  
	    public String toString(){  
	        return "data:"+this.data+";weight:"+this.weight;  
	    }  
	  
	    @Override  
	    public int compareTo(HffNode<T> other) {  
	        if(other.getWeight() > this.getWeight()){  
	            return 1;  
	        }  
	        if(other.getWeight() < this.getWeight()){  
	            return -1;  
	        }  
	          
	        return 0;  
	    }  
	
	
}
