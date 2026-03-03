public class ValidateBST {

    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static boolean isValid(Node root, Integer min, Integer max) {

        if (root == null) return true;

        if ((min != null && root.data <= min) ||
            (max != null && root.data >= max))
            return false;

        return isValid(root.left, min, root.data) &&
               isValid(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        System.out.println("Valid BST: " + isValid(root, null, null));
    }
}
