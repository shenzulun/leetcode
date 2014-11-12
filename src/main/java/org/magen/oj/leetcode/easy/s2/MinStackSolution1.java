package org.magen.oj.leetcode.easy.s2;

/**
 * add a field to store the diff of top and minValue
 * <pre>
Input:	push(2147483646),push(2147483646),push(2147483647),top,pop,getMin,pop,getMin,pop,push(2147483647),top,getMin,push(-2147483648),top,getMin,pop,getMin
Expected:	[2147483647,2147483646,2147483646,2147483647,2147483647,-2147483648,-2147483648,2147483647]
	</pre>
 *
 * @date Nov 12, 2014
 * @author shenzl
 *
 */
public class MinStackSolution1 {
	
	private transient Object[] elementData;
	
	private int size;
	
	private int min;
	
	private MinStackSolution1(int initialCapacity){
		super();
		if(initialCapacity < 0){
			initialCapacity = 1;
		}
		this.elementData = new Object[initialCapacity];
	}
	
	public MinStackSolution1(){
		this(10);
	}
	
	public void push(int x){
		//resize
		int v = x;
		if(size == 0){
			min = x;
		}else{
			v = x - min;
			min = (x <= min ? x : min);
		}
		ensureCapacity(size + 1);
		elementData[size++] = v;
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
		if(size < 0){
			throw new IllegalArgumentException("empty stack");
		}
		int top = Integer.valueOf(String.valueOf(elementData[size - 1])).intValue();
		if(top <= 0){
			//min change
			min -= top;
		}
		elementData[--size] = null;
		
	}
	
	public int top(){
		if(size < 0){
			throw new IllegalArgumentException("empty stack");
		}
		Object old = elementData[size - 1];
		int top = Integer.valueOf(String.valueOf(old)).intValue();
		if(size == 1){
			return top;
		}
		if(top > 0){
			top += min;
		}else{
			top = min;
		}
		return top;
	}
	
	public int getMin(){
		if(size < 0){
			throw new IllegalArgumentException("empty stack");
		}	
		return min;
	}
	
	public int size(){
		return size;
	}
}
