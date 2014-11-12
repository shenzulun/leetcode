package org.magen.oj.leetcode.easy.s2;

import org.junit.Test;

public class MinStackTest {
	
	@Test
	public void test1(){
		System.out.println("method->test1");
		MinStackSolution stack = new MinStackSolution();
		stack.push(5);
		stack.push(6);
		stack.push(4);
		System.out.println(stack.top());
		stack.pop();
		stack.push(7);			
		System.out.println(stack.size());
		System.out.println(stack.getMin());
	}
	
	@Test
	public void test2(){
		System.out.println("method->test2");
		MinStackSolution1 stack = new MinStackSolution1();
		stack.push(5);
		stack.push(6);
		stack.push(4);
		System.out.println(stack.top());
		stack.pop();
		stack.push(7);			
		System.out.println(stack.size());
		System.out.println(stack.getMin());
	}
	
	@Test
	public void test3(){
		System.out.println("method->test3");
		MinStackSolution2 stack = new MinStackSolution2();
		stack.push(5);
		stack.push(6);
		stack.push(4);
		System.out.println(stack.top());
		stack.pop();
		stack.push(7);			
		System.out.println(stack.size());
		System.out.println(stack.getMin());
	}

}
