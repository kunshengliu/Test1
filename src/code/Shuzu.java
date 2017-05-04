package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 数组
 * @author liukunsheng
 *
 */
public class Shuzu {
	/**
	 * 寻找这里面第3大的数字
	 */
	public static int findSecMax(int []  c){
		int k=10;
		int []  max= new int[k];
		
		for(int i=0;i<k;i++){
			max[i]=Integer.MIN_VALUE;
		}
		for(int i=0;i<c.length;i++){
			
			int tmp =c[i];
			if(tmp>max[k-1]){
				boolean flag=false;//标记能不能
				for(int m=0;m<k;m++){
					if(max[m]==tmp){
						flag=true;
					}
				}
				if(!flag){
					int m ;
					for(m=k-1;tmp>max[i];m--){
						max[m]=max[m-1];
						}
					max[m-1]=tmp;
					}
			}			
		}
		return max[k-1];
	}
	/**
	 *
	 *寻找出一个数组中出现次数最多的
	 *
	 */
	public static int findMostFrequentInArray( int [] A){
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();		
		for(int i=0;i<A.length;i++){
			Integer tmp = map.get(A[i]);
			if(tmp==null){
				map.put(A[i], 1);
			}else{
				map.put(A[i], tmp+1);
			}
		}
		int max=0;
		
		for(Entry<Integer, Integer> i:map.entrySet()){
			int tmp=i.getValue();
			if(max<tmp){
				max=tmp;
			}
		}
		return max;		
	}
	/**
	 * 
	 * 如何求数组中两辆相加等于某一个定值的组合
	 * 
	 */
	public static void findSum(int [] A,int sum){
		Arrays.sort(A);
		int begin=0;
		int end=A.length;
		while(begin<end){
			if(A[begin]+A[end]<sum){
				begin++;
			}else if(A[begin]+A[end]>sum){
				end--;
			}else{
				System.out.println(A[begin]+" "+A[end]);
				begin++;
				end--;
			}
		}
	}
	
	/**
	 * 数组的逆序,
	 */
	public static void nixushuzu(int [] A){
		int mid=A.length/2;
		int len=A.length-1;
		for(int i=0;i<mid;i++){
			int temp=A[i];
			A[i]=A[len-i];
			A[len-i]=temp;
		}
	}
	
	
}
