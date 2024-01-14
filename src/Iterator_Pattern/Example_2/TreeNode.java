package Iterator_Pattern.Example_2;

public class TreeNode<T> {
    T  value;
    TreeNode<T> left, right;

    TreeNode(T value) {
        this.value = value;
        left = null;
        right = null;
    }
}
