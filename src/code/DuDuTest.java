package code;
import java.util.*;
public class DuDuTest{
    public static void main(String []  args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
        int n =sc.nextInt();
        int [] c = new int[n];
        for(int i=0;i<n;i++){
            c[i] =sc.nextInt();
        }
        
        if(n<3){
            System.out.println(-1);
            return;
        }
        
        int k=3;
		int []  max= new int[k];		
		for(int i=0;i<k;i++){
			max[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<c.length;i++){
			
			int tmp =c[i];
			if(tmp<max[k-1]){
				boolean flag=false;//标记能不能
				for(int m=0;m<k;m++){
					if(max[m]==tmp){
						flag=true;
					}
				}
				if(!flag){
					int m=k-2 ;
					while(m>=0&&tmp<max[m]){
						max[m+1]=max[m];
						m--;
					}
					max[m+1]=tmp;
					}
			}	
		}
        if(max[2]==Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(max[2]);
        }
		//return max[2];
     }    
    }
}