package face;
/**
 * LRU�㷨ʵ��
 * @author liukunsheng
 *
 */
public class LRUTest {
	public static void main(String[] args) {
		int [] it = new int[]{4,7,0,7,1,0,1,2,1,2,6};
		int [] LRU = new int[]{-1,-1,-1,-1};
		int k=0;//��־
		for(int i=0;i<it.length;i++){
			if(k==4){
				boolean flag = false;
				for(int j=0;j<k;j++){
					if(LRU[j]==it[i]){
						flag =true;
						for(int m=j;m<k-1 ;m++){
							LRU[m]=LRU[m+1];
						}
						LRU[k-1]=it[i];
					}
				}
				if(flag==false){
					for(int m=0;m<k-1;m++){
						LRU[m]=LRU[m+1];
					}
					LRU[k-1]=it[i];
				}	
			}else{//k<=3
				boolean flag = false;//����������û�����ҳ��
                for(int j=0;j<k;j++){
                	if(LRU[j]==it[i]){
                		flag=true;//������
                		for(int m=j;m<k-1;m++){
                			LRU[m]=LRU[m+1];
                		}
                		LRU[k-1]=it[i];
                		break;
                	}
                }
                if(flag==false){
                	LRU[k++]=it[i];
                }	
			}
			for(int m=0;m<4;m++){
				System.out.print(LRU[m]+" ");
			}
			System.out.println("");

		}	
	}
}
