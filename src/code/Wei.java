package code;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 位运算
 * 
 * @author liukunsheng
 *
 */
public class Wei {
	
	/**
	 * 交换
	 * @param a
	 * @param b
	 */
	public void swap(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
	}
	/**
	 * 判断一个树是不是2的n次方
	 * 
	 */
	public static boolean isPower(int n){
		if(n<1){
			return false;
		}
		int i=0;
		while(i<=n){
			if(i==n){
				return true;
			}
			i=i<<1;
		}
		return false;
	}
	/**
	 * 判断一个二进制数是不是1
	 * 
	 */
	public static int countOne(int n){
		int count=0;
		while(n>0){
			if((n&1)==1){
				count++;
			}
			n=n>>1;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		//
		return count;
	}
	
	
	
	
	
	
	
}
