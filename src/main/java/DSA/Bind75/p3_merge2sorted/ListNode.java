package DSA.Bind75.p3_merge2sorted;




public class ListNode {
    ListNode next;
    int val;
    public ListNode(){}
    public ListNode(int val) {
        this.val = val;
    }


    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode curr = head;


        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                curr.next = list1;
                curr=curr.next;
                list1 = list1.next;
            }else {
                curr.next = list2;
                curr=curr.next;
                list2=list2.next;
            }
        }

        if(list1!=null){
            curr.next = list1;
        }
        if (list2!=null)curr.next = list2;
        head=head.next;


        return head;
    }
}