package code;
/**
 * 我自己再手写一遍
 * 小顶堆是逆序排序，大顶堆是升序排序
 * @author liukunsheng
 *
 */
public class Mytest {
	
	public static void main(String[] args) {
		int [] A = new int []{2,0,3,5,10,1};
		minHeapSort(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+",");
		}
	}
	
	public static void minHeapSort(int [] A){
		int i;
		int len =A.length;
		for(i=len/2;i>=0;i--){
			adjustMinHeap(A,i,len-1);
		}
		for(i=len-1;i>=0;i--){
			int tmp=A[0];
			A[0]=A[i];
			A[i]=tmp;
			adjustMinHeap(A,0,i-1);
		}
	}
	/**
	 * 
	 * @param A
	 * @param pos
	 * @param len
	 */
	public static void adjustMinHeap(int [] A,int pos,int len){
		int tmp;
		int child = 0;
		for(tmp=A[pos];2*pos+1<=len;pos=child){
			child=2*pos+1;
			if(child<len&&A[child]>A[child+1]){
				child++;
			}
			if(tmp>A[child]){
				A[pos]=A[child];
			}else{
				break;
			}
		}
		A[pos]=tmp;
	}
	
	
}
