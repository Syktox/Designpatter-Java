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

        if (value.compareTo(current.value) < 0) {
            root.left = addTreeNode(root.left, value);
        } else if (value.compareTo(current.value) > 0) {
            root.right = addTreeNode(root.right, value);
        }
        return root;
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


