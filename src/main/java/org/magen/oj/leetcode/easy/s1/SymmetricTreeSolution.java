package org.magen.oj.leetcode.easy.s1;

/**
 * <pre>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

	For example, this binary tree is symmetric:
	
	    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3
	But the following is not:
	    1
	   / \
	  2   2
	   \   \
	   3    3
   </pre>
 * @author shenzl
 * @date 2014-11-11
 *
 */
public class SymmetricTreeSolution {
	
	public boolean isSymmetric(TreeNode root) {
        return root == null?true:check(root,root);
    }
	
	private boolean check(TreeNode left,TreeNode right){
		if(left == null || right == null){
			return left == right;
        }else if(left.val != right.val){
        	return false;
        }else{
            return check(left.left,right.right) && check(left.right,right.left);
        }
	}

}
