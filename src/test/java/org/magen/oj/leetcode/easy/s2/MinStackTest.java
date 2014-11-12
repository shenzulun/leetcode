package org.magen.oj.leetcode.easy.s2;

import org.junit.Test;

public class MinStackTest {
	
	@Test
	public void test1(){
		//Expected:	[2,1,1,1]
		System.out.println("method->test1");
		MinStackSolution stack = new MinStackSolution();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();				
		System.out.println(stack.getMin());
		System.out.println(stack.top());
	}
	
	@Test
	public void test2(){
		//Expected:	[2,1,1,1]
		System.out.println("method->test2");
		MinStackSolution1 stack = new MinStackSolution1();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();				
		System.out.println(stack.getMin());
		System.out.println(stack.top());
	}
	
	@Test
	public void test3(){
		//Expected:	[2,1,1,1]
		System.out.println("method->test3");
		MinStackSolution2 stack = new MinStackSolution2();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();				
		System.out.println(stack.getMin());
		System.out.println(stack.top());
	}

}
