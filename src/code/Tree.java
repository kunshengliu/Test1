package code;

import java.util.ArrayList;
import java.util.Stack;


/**
 * 所有关于树的
 * @author liukunsheng
 *
 */
public class Tree {
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		ArrayList<Integer> l=houxu(n1);
		System.out.println(l);
	}
	
	public void xianxubianli(TreeNode root,ArrayList<Integer> list){
		if(root==null){
			return;
		}
		list.add(root.val);
		xianxubianli(root.left,list);
		xianxubianli(root.right,list);
	}
	public void zhongxubianli(TreeNode root,ArrayList<Integer> list){
		if(root==null){
			return;
		}
		zhongxubianli(root.left,list);
		list.add(root.val);
		zhongxubianli(root.right,list);
	}
	public void houxubianli(TreeNode root,ArrayList<Integer> list){
		
	}
	
	/**
	 * 以下是非递归的二叉树遍历
	 */
	
	public static ArrayList<Integer> xianxu(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root!=null){
			stack.push(root);
			while(!stack.isEmpty()){
				TreeNode tmp = stack.pop();
				list.add(tmp.val);
				if(tmp.right!=null){
					stack.push(tmp.right);
				}
				if(tmp.left!=null){
					stack.push(tmp.left);
				}		
			}
		}
		return list;
	}
	public static ArrayList<Integer> zhongxu(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root!=null){
			stack.push(root);
			while(!stack.isEmpty()){
				TreeNode tmp = stack.peek();
				if(tmp.left!=null){
					stack.add(tmp.left);
					tmp.left=null;
				}else{
					list.add(tmp.val);
					stack.pop(); 
					if(tmp.right!=null){
						stack.add(tmp.right);
					}
				}
			}	
		}
		return list;
	}
	public static ArrayList<Integer> houxu(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root!=null){
			stack.add(root);
			while(!stack.isEmpty()){
				TreeNode tmp = stack.peek();
				if(tmp.left==null&&tmp.right==null){
					list.add(tmp.val);
					stack.pop();
					continue;
				}				
				if(tmp.right!=null){
					stack.add(tmp.right);
					tmp.right=null;
				}
				if(tmp.left!=null){
					stack.add(tmp.left);
					tmp.left=null;
				}		
			}
		}
		return list;
		
	}
	
	/**
	 * 判断平衡二叉树
	 * 
	 */
	public boolean chk(TreeNode root){
		int c =check(root);
		return c>=0;
	}
	
	public int check(TreeNode root){
		if(root==null)
			return 0;
		int l =check(root.left);
		int r =check(root.right);
		
		if(l<0||r<0){
			return -1;
		}
		if(Math.abs(r-l)>1){
			return -1;
		}
		return l>r?l+1:r+1;
		
		
	}
	
	
	
	
}
