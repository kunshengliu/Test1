package code;

import java.util.LinkedList;
import java.util.Queue;

/**
 * λ����
 * 
 * @author liukunsheng
 *
 */
public class Wei {
	
	/**
	 * ����
	 * @param a
	 * @param b
	 */
	public void swap(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
	}
	/**
	 * �ж�һ�����ǲ���2��n�η�
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
	 * �ж�һ�����������ǲ���1
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
