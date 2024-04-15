/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String value1 = value(l1);
        String value2 = value(l2);

    
        char[] ans = ((new BigInteger(value1).add(new BigInteger(value2)))).toString().toCharArray();
        ListNode answer = new ListNode(Integer.parseInt(ans[ans.length-1]+""));
        ListNode now = answer;
        for(int i=ans.length-2; i>=0; i--){
            ListNode n = new ListNode(Integer.parseInt(ans[i]+""));
            now.next = n;
            now = n;

        }
        return answer;
    }
    public String value(ListNode x){
        if(x == null) return "";
        else return value(x.next) + x.val;
    }
}