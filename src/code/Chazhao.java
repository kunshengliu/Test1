package code;
/**
 * ≤È’“
 * @author liukunsheng
 *
 */
public class Chazhao {
	public static int search(int [] A,int num){
		int low =0;
		int high=A.length;
		int mid;
		while(low<=high){
			mid =(low+high)/2;
			if(A[mid]==num){
				return num;
			}else if(A[mid]<num){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return -1;	
	}
}
