package code;
/**
 *排序算法总汇 
 * @author liukunsheng
 */
public class Sort {
	public static void main(String[] args) {
		int [] A = new int []{2,0,3,5,10,1};
		charu(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+",");
		}
	}
	/**
	 * 冒泡
	 * @param A
	 */
	public static void maopao(int [] A){
		for(int i=0;i<A.length-1;i++){
			for(int j=0;j<A.length-i-1;j++){
				if(A[j]>A[j+1]){
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] =temp;
				}
			}
		}
	}
	/**
	 * 冒泡排序的改进
	 * 1.设置一个flag
	 * @param A
	 */
	public static void maopaoGaijin(int [] A){
		for(int i=0;i<A.length-1;i++){
			boolean flag = true;
			for(int j=0;j<A.length-i-1;j++){
				if(A[j]>A[j+1]){
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] =temp;
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
	}
	
	
	
	/**
	 * 选择排序
	 */
	public static void xuanze(int [] A){
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if(A[i]>A[j]){
					int temp = A[i];
					A[i] =A[j];
					A[j] =temp;
				}				
			}
		}
	}
	
	/**
	 *插入排序 
	 * 
	 */
	public static void charu(int [] A){
		for(int i=1;i<A.length;i++){
			if(A[i]<A[i-1]){//插入操作
				int j =i-1;
				int flag=A[i];
				while(j>=0&&A[j]>flag){
					A[j+1]=A[j];
					j--;
				}
				A[j+1]=flag;
			}
		}
	}
	/**
	 * kuaipai
	 * @param A
	 */
	public static void kuaipai(int [] A){
		kuaipai(A,0,A.length-1);
	}
	public static void kuaipai(int [] A,int start,int end){
		if(start>=end){
			return;
		}
		int i=start;
		int j=end;
		int flag=A[i];
		while(i<j){
			while(i<j&&flag<A[j]){
				j--;
				}
			if(i<j){
				A[i]=A[j];
				i++;
				}
			while(i<j&&A[i]<flag){
				i++;
				}
			if(i<j){
				A[j]=A[i];
				j--;
				}
			}
		A[i]=flag;
		kuaipai(A,start,i-1);
		kuaipai(A,i+1,end);	
		}
	/**
	 * 堆排序
	 * 一个节点，r(i),器左孩子为
	 * 思路，首先用数组模拟一个完全二叉树
	 * 初始时刻构建一颗二叉树堆
	 * 然后调整二叉树的对
	 */
	
	/**
	 * 最小堆的排序
	 * @param array
	 */
	public static void myMinHeapSort(int[] array){
		int i;
		int len=array.length;//length=10;
		for(i=len/2-1;i>=0;i--){
			adjustMinHeap(array,i,len-1);//
		}
		for(i=len-1;i>=0;i--){
			int tmp = array[0];
			array[0]=array[i];
			array[i]=tmp;
			adjustMinHeap(array, 0, i-1);
		}
		
	}
	/**
	 * 调整最小堆
	 * @param a 数据
	 * @param pos
	 * @param len 需要调整0-len之间的数字
	 */
	private static void adjustMinHeap(int[] a, int pos, int len) {
		int temp;
		int child;
		for(temp=a[pos];2*pos+1<=len;pos=child){
			child=2*pos+1;//左孩子
			if(child<len&&a[child]>a[child+1]){
				child++;//
			}
			if(a[child]<temp){//孩子比父节点小。
				a[pos]=a[child];//如果小就交换。
			}else{
				break;
			}
		}
		a[pos]=temp;
	}
}


/**
 * 堆排序
 */





