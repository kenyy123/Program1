package huffmanTree;

public class HffNode1 implements Comparable {

	private int value;  
	private HffNode1 leftChild;  
	private HffNode1 rightChild;  
	public HffNode1(int value) {  
	       this.value = value;  
	     }  
	  
	public int getValue() {  
	        return value;  
	    }  
	  
	public void setValue(int value) {  
	        this.value = value;  
	   }  
	  
	public HffNode1 getLeftChild() {  
	         return leftChild;  
	     }  
	  
	public void setLeftChild(HffNode1 leftChild) {  
	         this.leftChild = leftChild;  
	    }  
	  
	public HffNode1 getRightChild() {  
	         return rightChild;  
	     }  
	  
	public void setRightChild(HffNode1 rightChild) {  
	        this.rightChild = rightChild;  
	    }  
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		HffNode1 that = (HffNode1) o;  
	       double result = this.value - that.value;  
	       return result > 0 ? 1 : result == 0 ? 0 : -1;  
		
	}

}
