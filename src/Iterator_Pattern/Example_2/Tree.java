package Iterator_Pattern.Example_2;



public class Tree<T extends Comparable<T>> {
    TreeNode<T> root;
    Tree() {
        root = null;
    }

    void addNode(T value) {
        root = addTreeNode(root, value);
    }

    private TreeNode<T> addTreeNode(TreeNode<T> current, T value) {
        if (current == null) {
            return new TreeNode<T>(value);
        }
        current = new TreeNode<>(value);
        if (current.value.compareTo(value) > 0) {
            if (current.left == null) {
                current.left = new TreeNode<>(value);
                System.out.println("LEFT");
            }
            System.out.println(current.value + ": " + value);
        } else {
            if (current.right == null) {
                current.right = new TreeNode<>(value);
                System.out.println("RIGTH");
            }
            System.out.println(current.value + ": " + value);
        }
        return current;
    }

}

class TreeExampleDemo {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        for (int i = 1; i <= 30; i++) {
            tree.addNode(i);
        }


    }
}


