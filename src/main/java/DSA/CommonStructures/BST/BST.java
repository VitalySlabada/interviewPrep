package DSA.CommonStructures.BST;

public class BST {
    Node root;

    //insert
    public void insert(int num) {

        Node newNode = new Node(num);
        if (root == null) {
            root = newNode;
            return;
        }

        Node curr = root;
        while (true) {
            if (num <= curr.num) {
                if (curr.left == null) {
                    curr.left = newNode;
                    break;
                }
                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = newNode;
                    break;
                } else {
                    curr = curr.right;
                }
            }
        }

    }


}
