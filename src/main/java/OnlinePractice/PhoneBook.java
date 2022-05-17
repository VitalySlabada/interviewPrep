package OnlinePractice;

public class PhoneBook {

    public PhoneNode head;
    public PhoneNode tail;
    public int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (isEmpty()) {
            throw new RuntimeException("empty");
        }
        PhoneNode current = head;
        while (current!=null){
            System.out.println(current+"->");
            current=current.next;
        }
    }
    public void insert (String firstName, String lastName, String email, String phoneNumber){
        PhoneNode node = new PhoneNode(firstName,lastName,email,phoneNumber);

        if (isEmpty())head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }


}
