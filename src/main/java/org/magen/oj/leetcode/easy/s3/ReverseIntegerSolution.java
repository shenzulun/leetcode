package org.magen.oj.leetcode.easy.s3;

/**
 * <pre>
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * draft:
 * Integer.MAX_VALUE=2147483647
 * 	reverse->7463847412
 * Integer.MIN_VALUE=-2147483648
 * 	reverse->-
 * overflow:
 * 100000000(3-9)
 * 
 * 
 * 
 * </pre>
 * @author shenzl
 * @date 2014年11月12日
 */
public class ReverseIntegerSolution {
	
	public int reverse(int x) {
		if(x == 0){
			return 0;
		}
		boolean isPositive = x > 0;
		long input = isPositive ? x : 0 - x;
		long temp = 0;
		while(input > 0){
			temp = temp * 10 + input % 10;
			input /= 10;
		}
		temp = isPositive ? temp : 0 - temp;
		if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
			return 0;
		}
		return (int)temp;
    }
	
}
