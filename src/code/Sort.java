package code;
/**
 *�����㷨�ܻ� 
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
	 * ð��
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
	 * ð������ĸĽ�
	 * 1.����һ��flag
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
	 * ѡ������
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
	 *�������� 
	 * 
	 */
	public static void charu(int [] A){
		for(int i=1;i<A.length;i++){
			if(A[i]<A[i-1]){//�������
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
	 * ������
	 * һ���ڵ㣬r(i),������Ϊ
	 * ˼·������������ģ��һ����ȫ������
	 * ��ʼʱ�̹���һ�Ŷ�������
	 * Ȼ������������Ķ�
	 */
	
	/**
	 * ��С�ѵ�����
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
	 * ������С��
	 * @param a ����
	 * @param pos
	 * @param len ��Ҫ����0-len֮�������
	 */
	private static void adjustMinHeap(int[] a, int pos, int len) {
		int temp;
		int child;
		for(temp=a[pos];2*pos+1<=len;pos=child){
			child=2*pos+1;//����
			if(child<len&&a[child]>a[child+1]){
				child++;//
			}
			if(a[child]<temp){//���ӱȸ��ڵ�С��
				a[pos]=a[child];//���С�ͽ�����
			}else{
				break;
			}
		}
		a[pos]=temp;
	}
}


/**
 * ������
 */





