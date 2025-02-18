package task21;
import java.util.*;

	class ListNode{
		
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}

	public class TwoSumSolution {
		public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
			
			ListNode dumy = new ListNode(-1);
			ListNode current = dumy;
			
			while(l1 != null && l2 != null) {
				
				if(l1.val <= l2.val) {
					current.next = l1;
					l1 = l1.next;
				}
				else {
					
					current.next = l2;
					l2 = l2.next;
				}
				
				current = current.next;
			}
			if(l1 != null) {
				current.next = l1;
				
			}
			if(l2 != null) {
				current.next = l2;
			}
			
			return dumy.next;
		}
		public static void main(String[] args) {
			
			ListNode l1 = new ListNode(1);
			l1.next = new ListNode(3);
			l1.next.next = new ListNode(5);
			
			ListNode l2 = new ListNode(2);
			l2.next = new ListNode(4);
			l2.next.next = new ListNode(6);
			
			ListNode mergeHead = mergeTwoList(l1, l2);
			
			System.out.println("Merged Sort List : ");
			
			while(mergeHead != null ) {
				System.out.println(mergeHead.val + " ");
				
				mergeHead = mergeHead.next;
			}
		}

	}
	


