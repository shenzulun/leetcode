package org.magen.oj.leetcode.easy.s3;

import org.junit.Test;

public class ReverseIntegerTest {
	
	@Test
	public void test0(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int a = 2^32;
		System.out.println(a > Integer.MAX_VALUE);
	}
	
	@Test
	public void test1(){
		ReverseIntegerSolution solu = new ReverseIntegerSolution();
		int x = -915673;
		System.out.println("input->" + x);
		System.out.println("reverse->" + solu.reverse(x));
	}
	
	@Test
	public void test2(){
		ReverseIntegerSolution solu = new ReverseIntegerSolution();
		int x = 2189010;
		System.out.println("input->" + x);
		System.out.println("reverse->" + solu.reverse(x));
	}
	
	@Test
	public void test3(){
		ReverseIntegerSolution solu = new ReverseIntegerSolution();
		int x = 2000123028;
		System.out.println("input->" + x);
		System.out.println("reverse->" + solu.reverse(x));
	}
	
	@Test
	public void test4(){
		ReverseIntegerSolution solu = new ReverseIntegerSolution();
		int x = -2100345692;
		System.out.println("input->" + x);
		System.out.println("reverse->" + solu.reverse(x));
	}

}
