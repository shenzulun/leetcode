package org.magen.oj.leetcode.easy.s4;

/**
 * Implement atoi to convert a string to an integer.
 * @date 2014年11月19日
 * @author shenzl
 */
public class StringToIntegerSolution {
	
	public int atoi(String str) {
		if(str == null || "".equals(str)){
			return 0;
		}
		long res = 0;
		int validCharCount = 0;
		boolean isPositive = true;
		char[] arr = str.toCharArray();
		for(int i=0,len=arr.length;i<len;i++){
			if(validCharCount > 11){
				//overflow
				return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			if(Character.isWhitespace(arr[i])){
				//whitespace " "
				if(validCharCount > 0){
					break;
				}
				continue;
			}else if(Character.isDigit(arr[i])){
				//digit
				res = 10 * res + (arr[i] - 48);
				validCharCount++;
			}else if(arr[i] == '-'){
				if(validCharCount > 0){
					break;
				}else{
					isPositive = false;
					validCharCount++;		
				}
			}else if(arr[i] == '+'){
				if(validCharCount > 0){
					break;
				}else{
					validCharCount++;		
				}
			}else{
				//invalid
				break;
			}
		}
		res = isPositive ? res : 0 - res;
		if(res > Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}else if(res < Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}else{
			return (int)res;
		}
	}	
}
