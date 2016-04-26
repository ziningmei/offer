package com.offer;

import com.offer.LinkedListSummary.Node;

public class LinkedList {

	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode findKthToTail(ListNode head, int k) {
		ListNode a = head, b = head;
		if (head == null || head.next == null || k == 0) {
			return null;
		}
		for (int i = 1; i < k; i++) {
			a = a.next;
			if (a == null) {
				return null;
			}
		}
		while (a.next != null) {
			a = a.next;
			b = b.next;
		}
		return b;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	public ListNode merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if(list2==null){
			return list1;
		}
		ListNode list=null;
		if(list1.val<=list2.val){
			list=list1;
			list1=list1.next;
		}else{
			list=list2;
			list2=list2.next;
		}
		ListNode list3=list;
		while(list1!=null||list2!=null){
			if(list1==null) {
				list.next=list2;
				break;
			}else if(list2==null){
				list.next=list1;
				break;
			}
			if(list1.val<=list2.val){
				list.next=list1;
				list1=list1.next;
			}else{
				list.next=list2;
				list2=list2.next;
			}
			list=list.next;
			
		}
		return list3;
	}

	public static void main(CharactorString[] args) {
		ListNode a1 = new ListNode(1);
//		ListNode a2 = new ListNode(2);
//		ListNode a3 = new ListNode(3);
//		ListNode a4 = new ListNode(4);
//		ListNode a5 = new ListNode(5);
//		a1.next = a3;
//		a3.next  = a5;
//		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(2);
//		ListNode b3 = new ListNode(3);
//		ListNode b4 = new ListNode(4);
//		ListNode b5 = new ListNode(5);
//		ListNode b5 = new ListNode(6);
//		b2.next = b4;
//		b4.next = b5;
		LinkedList findKthToTail = new LinkedList();
		// System.out.println(findKthToTail.findKthToTail(a1, 5).val);
		ListNode listNode = findKthToTail.merge(a1, b2);
		while (listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
}