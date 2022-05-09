package DSA.LL;

public class LL_app {
    public static void main(String[] args) {
        MyLL ll = new MyLL();

        ll.deleteNode(1);

        ll.printLL();
        ll.add(1);
        ll.printLL();
        ll.deleteNode(1);
        ll.printLL();
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.printLL();

        ll.deleteNode(3);
        ll.printLL();
        ll.deleteNode(1);
        ll.printLL();
    }




}
