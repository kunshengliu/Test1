package code;

public class List {
	
	
	/**
	 * 删除链表中重复数据
	 * 两层的for循环
	 */
	public void deleteDuplecate(ListNode head){
		ListNode p =head;
		while(p!=null){
			ListNode q =p;
			while(q.next!=null){
				//ListNode tmp=q.next;//要比较的元素
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
	 * 找出倒数的滴k个元素
	 * 快慢指针问题
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
	 * 链表的翻转
	 * 1.就是使用栈
	 * 2.遍历一遍
	 * 两种方法
	 */
	public ListNode nixu(ListNode head){
		ListNode pre=null;//前一个节点
		ListNode next=null;//下一个节点
		while(head!=null){
			next=head.next;//记录下一个节点
			head.next=pre;//记录上个节点
			pre=head;//对pre进行更新
			head=next;//对head进行更新
		}
		return pre;
	}
	
	/**
	 * 
	 * 链表的中间位置
	 * 快慢指针
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
	 * 快慢指针
	 * 检验一个单链表是否有环
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
	 * 判断两个单链表相交
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
	 * 判断两个链表的相交位置	
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
