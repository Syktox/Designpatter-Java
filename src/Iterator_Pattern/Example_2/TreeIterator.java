package Iterator_Pattern.Example_2;

import java.util.Stack;

public class TreeIterator<T> implements Iterator<T> {
    private Stack<TreeNode<T>> stack;

    TreeIterator(TreeNode<T> root) {
        stack = new Stack<>();
        pushAllOnStack(root);
    }

    void pushAllOnStack(TreeNode<T> node) {
        stack.add(node);
        node = node.left;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        TreeNode<T> tmpNode = stack.pop();
        pushAllOnStack(tmpNode.right);
        return tmpNode.value;
    }
}
