public class _203_removeElements_dummyHead {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode fast = head;
        ListNode slow =  dummy;
        while(fast != null){
            // 如果遇到了要跳过的值
            if(fast.val == val)
                slow.next = fast.next;
                // 如果没有遇到
            else
                slow = fast;
            fast = fast.next;
        }
        return dummy.next;
    }
}
