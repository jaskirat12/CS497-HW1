public static Node remFromEnd(Node head, int n) {
		Node prev;
		Node cur = head;
		int count = 0;
		while(cur.next != null) {
			count++;
			cur = head.next;
		}
		cur = head;
		for(count = count - n; count > 0; count--) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = cur.next;
		cur.next = null;
		return head;
}
