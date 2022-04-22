package DSA.P4_LL_skip_nodes;

import DSA.P4_LL_skip_nodes.myLLpkg.MySinglyLinkedList;

public class App {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i= 1; i<21; i++){
            list.add(i);
        }
        list.printNodes();
        System.out.println();
        DeleteNodesAfterNodes.delNodesSkipNodes(n,m,list.head);
        System.out.println("keep :" + n + "\nskip :" + m);
        list.printNodes();
        System.out.println();
    }

}
