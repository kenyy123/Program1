package ds_stack;

public interface StackInterface<T> {

	boolean isEmpty();
	
	void push(T data);
	
	T pop();
}
