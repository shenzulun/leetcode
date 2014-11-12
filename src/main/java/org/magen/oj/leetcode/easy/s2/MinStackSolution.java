package org.magen.oj.leetcode.easy.s2;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
	<pre>
	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	getMin() -- Retrieve the minimum element in the stack.
	</pre>
 * add a new stack to store the min element
 *
 * @date Nov 12, 2014
 * @author shenzl
 *
 */
public class MinStackSolution {
	
	private transient Object[] elementData;
	
	private transient int[] minStack;
	
	private int size;
	//minStack size
	private int size2;
	
	private MinStackSolution(int initialCapacity){
		super();
		if(initialCapacity < 0){
			initialCapacity = 1;
		}
		this.elementData = new Object[initialCapacity];
		this.minStack = new int[initialCapacity/2];
	}
	
	public MinStackSolution(){
		this(10);
	}
	
	public void push(int x){
		//resize
		ensureCapacity(size + 1);
		elementData[size++] = x;
	
		if(size2 == 0){
			//first push into stack
			minStack[size2++] = x;
		}else{
			//compare 
			if(x <= minStack[size2 - 1]){
				//resize
				int oldCapacity = minStack.length;
				if(oldCapacity < (size2 + 1)){
					int newCapacity = (oldCapacity * 3)/2 + 1;				
					int[] newElementData = new int[newCapacity];
					System.arraycopy(minStack, 0, newElementData, 0, size2);
					minStack = newElementData;
				}
				minStack[size2++] = x;
			}
		}
	}
	
	public void ensureCapacity(int minCapacity){
		int oldCapacity = elementData.length;
		if(oldCapacity < minCapacity){
			int newCapacity = (oldCapacity * 3)/2 + 1;
			if(newCapacity < minCapacity){
				newCapacity = minCapacity;
			}
			Object[] newElementData = new Object[newCapacity];
			System.arraycopy(elementData, 0, newElementData, 0, size);
			elementData = newElementData;
		}
	}
	
	public void pop(){
		if(size < 1){
			throw new IllegalArgumentException("empty stack");
		}
		int old = top();
		elementData[--size] = null;
		
		if(minStack[size2 - 1] == old){
			//minStack pop
			minStack[--size2] = -1;
		}
	}
	
	public int top(){
		if(size < 1){
			throw new IllegalArgumentException("empty stack");
		}
		Object old = elementData[size - 1];
		return Integer.valueOf(String.valueOf(old)).intValue();
	}
	
	public int getMin(){
		if(size < 1){
			throw new IllegalArgumentException("empty stack");
		}	
		return minStack[size2 - 1];
	}
	
	public int size(){
		return size;
	}
}
