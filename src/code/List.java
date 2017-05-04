package code;

public class List {
	
	
	/**
	 * ɾ���������ظ�����
	 * �����forѭ��
	 */
	public void deleteDuplecate(ListNode head){
		ListNode p =head;
		while(p!=null){
			ListNode q =p;
			while(q.next!=null){
				//ListNode tmp=q.next;//Ҫ�Ƚϵ�Ԫ��
				if(p.val==q.next.val){
					q.next=q.next.next;
				}else{
					q=q.next;
				}
			}
			p=p.next;	
		}
	}
	
	
	/**
	 * �ҳ������ĵ�k��Ԫ��
	 * ����ָ������
	 * 
	 */
	public ListNode find(ListNode head,int k){
		ListNode fast=head;
		ListNode slow=head;
		while(k>0){
			fast=fast.next;
			k--;
		}
		while(fast!=null){
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	
	/***
	 * ����ķ�ת
	 * 1.����ʹ��ջ
	 * 2.����һ��
	 * ���ַ���
	 */
	public ListNode nixu(ListNode head){
		ListNode pre=null;//ǰһ���ڵ�
		ListNode next=null;//��һ���ڵ�
		while(head!=null){
			next=head.next;//��¼��һ���ڵ�
			head.next=pre;//��¼�ϸ��ڵ�
			pre=head;//��pre���и���
			head=next;//��head���и���
		}
		return pre;
	}
	
	/**
	 * 
	 * ������м�λ��
	 * ����ָ��
	 */
	public ListNode searchMid(ListNode head){
		ListNode fast=null;
		ListNode slow=null;
		while(fast!=null&&fast.next!=null&&fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}	
		return slow;
	}
	
	/**
	 * ����ָ��
	 * ����һ���������Ƿ��л�
	 */
	public boolean isLoop(ListNode list){
		ListNode fast =null;
		ListNode slow =null;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * �ж������������ཻ
	 */
	public boolean isXiangjiao(ListNode h1,ListNode h2){
		while(h1.next!=null){
			h1=h1.next;
		}
		while(h2.next!=null){
			h2=h2.next;
		}
		if(h1==h2){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * �ж�����������ཻλ��	
	 */
	public ListNode xiangJiao(ListNode h1,ListNode h2){
		ListNode th1=h1;
		ListNode th2=h2;
		int t1=1;
		int t2=1;
		
		while(th1.next!=null){
			th1=th1.next;
			t1++;
		}
		while(th2.next!=null){
			th2=th2.next;
			t2++;
		}
		
		if(th1!=th2){
			return null;
		}
		
		
		if(t1>t2){
			th1=h1;
			int i=t1-t2;
			while(i>0){
				th1=th1.next;
				i--;
			}
		}else{
			int i=t2-t1;
			th2=h2;
			while(i>0){
				th2=th2.next;
			}
		}
		while(th1!=th2){
			th1=th1.next;
			th2=th2.next;
		}
		
		return th1;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
