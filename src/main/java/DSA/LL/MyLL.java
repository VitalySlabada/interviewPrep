package DSA.LL;

public class MyLL{

    Node head;
    Node tail;
    int size;

    public MyLL() {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }


    // is Empty
    public boolean isEmpty () {return head==null;}

    // add
    //check if null - add as head & tail
    //add node to the tail
    //make last node a tail
    public void add (int num){
        Node node = new Node(num);
        if (isEmpty()) head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }


    //make temp node- propagate through the whole ll
    public void printLL(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.num+"->");

            temp = temp.next;
        }
        System.out.println(" size = "+ size );
    }

    // delete Node
    // lets assume first Node with certain number need to be deleted
    public void deleteNode (int num){
        //if empty
        if (isEmpty()) {
            System.out.println("cant delete anything from an empty LL");
            return;
        }
        //if only one
        if (size ==1){
            if(head.num== num) {
                head = tail = null;
                size--;
                return;
            }
        }

        //if multiple
        Node prev = head;
        Node curr = head.next;

        while (curr != null){

            if (curr.num == num){
                prev.next = curr.next;
                size--;
                return;
            }
            curr = curr.next;
            prev = prev.next;
        }

    }

}
