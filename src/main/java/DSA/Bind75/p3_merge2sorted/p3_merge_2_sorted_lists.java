package DSA.Bind75.p3_merge2sorted;

public class p3_merge_2_sorted_lists {



}
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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode curr = head;

        while(list1!=null&&list2!=null){

            if (list1.val<=list2.val){
                //condition if head
                if(head==null){
                    curr.val=list1.val;
                    list1=list1.next;
                    curr=curr.next;
                }
                else{
                    curr = new ListNode(list1.val);
                    list1=list1.next;
                    curr=curr.next;
                }

            }

         else{
         //condition if head
             if(head==null){
                 curr.val=list2.val;
                 list2=list2.next;
                 curr=curr.next;
             }
             else{
                 curr = new ListNode(list2.val);
                 list2=list2.next;
                 curr=curr.next;
             }

         }


        }

        return head;
    }
}