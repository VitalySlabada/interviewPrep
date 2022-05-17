package DSA.Bind75.p3_merge2sorted;

public class app {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(3);
        list1.next  = new ListNode(4);
        list1.next.next  = new ListNode(6);
        ListNode list2 = new ListNode(3);
        list2.next  = new ListNode(5);
        list2.next.next= new ListNode(7);
        list2.next.next.next  = new ListNode(8);


        ListNode.mergeTwoLists(list1,list2);

    }



}
