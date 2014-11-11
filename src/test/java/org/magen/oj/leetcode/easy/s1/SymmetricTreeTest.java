package org.magen.oj.leetcode.easy.s1;

import org.junit.Test;

public class SymmetricTreeTest {
	
	@Test
	public void test0(){
		
		TreeNode root = new TreeNode(1);
		TreeNode le1 = new TreeNode(2);
		TreeNode ri1 = new TreeNode(2);
		root.left = le1;
		root.right = ri1;
		
		TreeNode le21 = new TreeNode(3);
		TreeNode ri21 = new TreeNode(4);
		le1.left = le21;
		le1.right = ri21;
		
		TreeNode le22 = new TreeNode(4);
		TreeNode ri22 = new TreeNode(3);
		ri1.left = le22;
		ri1.right = ri22;
		
		SymmetricTreeSolution solu = new SymmetricTreeSolution();
		System.out.println(solu.isSymmetric(root));
	}

}
