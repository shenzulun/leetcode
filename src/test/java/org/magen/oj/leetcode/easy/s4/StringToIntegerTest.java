package org.magen.oj.leetcode.easy.s4;

import org.junit.Test;

public class StringToIntegerTest {
	
	@Test
	public void test0(){
		String str = " ";
		char[] arr = str.toCharArray();
		
		System.out.println(arr.length);
		System.out.println(arr[0] == ' ');
		System.out.println(Character.isWhitespace(arr[0]));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
	protected void show(String str){
		StringToIntegerSolution solu = new StringToIntegerSolution();
		System.out.println("input->" + str);
		System.out.println("output->" + solu.atoi(str));
	}
	
	@Test
	public void test1(){
		String str = " 123 ";
		show(str);
	}
	
	@Test
	public void test2(){
		String str = " -123 ";
		show(str);
	}
	
	@Test
	public void test3(){
		String str = "-12 3 ";
		show(str);
	}
	
	@Test
	public void test4(){
		String str = "-12 -3 ";
		show(str);
	}
	
	@Test
	public void test5(){
		String str = " -12 -3 ";
		show(str);
	}
	
	@Test
	public void test6(){
		String str = " 12A3 ";
		show(str);
	}
	
	@Test
	public void test7(){
		String str = "2147483648";
		show(str);
	}
	
	@Test
	public void test8(){
		String str = "-2147483649";
		show(str);
	}
	
	@Test
	public void test9(){
		String str = "+217483649";
		show(str);
	}
	
	@Test
	public void test10(){
		String str = " +214836  ";
		show(str);
	}

}
