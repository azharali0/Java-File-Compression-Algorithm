class Node {
    int counter;
    char ch;
    Node left;
    Node right;

    Node(char ch) {
        this.ch = ch;
    }
}

public class PathBST {
    int counter = 0;

    int count(Node node, char ch, char k) {
        if (node == null) {
            System.out.println("Not found");
            return 0;
        } else if (node.data < ch) {
            counter++;
        }
    }

    public Node insert(Node node, int val) {

        if (node == null) {
            return new Node(val);
        } else if (val >= node.data) {
            node.right = insert(node.right, val);
        } else if (val < node.data) {
            node.left = insert(node.left, val);
        }
        return node;
    }
}
