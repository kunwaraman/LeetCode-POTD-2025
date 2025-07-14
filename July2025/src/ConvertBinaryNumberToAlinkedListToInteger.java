 class ListNode {
     int val;
      ListNode next;
     ListNode() {}
   ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

/*
time complexity: O(n);
space complexity: O(1);
 */
public class ConvertBinaryNumberToAlinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int res=0;
        while(head!=null){
            res=(res<<1)|head.val;
            head=head.next;
        }
        return res;
    }
}
