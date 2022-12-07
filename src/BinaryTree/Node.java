package BinaryTree;

public class Node<T extends Comparable<T>> {
    private Node<T> left;
    private T content;
    private Node<T> right;

    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public void setLeft(Node<T> aNode) {
        this.left = aNode;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setRight(Node<T> aNode) {
        this.right = aNode;
    }

    void insertNode(T content2) {
        Node<T> aNode = new Node<>(content2);
        if (content2.compareTo(this.getContent()) == 0) {
            System.out.println("REPEATED!");
        } else if (content2.compareTo(this.getContent()) < 0) {
            if (this.left == null) {
                this.left = aNode;
            } else {
                this.left.insertNode(content2);
            }
        } else {
            if (this.right == null) {
                this.right = aNode;
            } else {
                this.right.insertNode(content2);
            }
        }
    }

    T findNode(T value) {
        if (value.compareTo(this.getContent()) == 0) {
            return this.getContent();
        } else if (value.compareTo(this.getContent()) < 0) {
            if (this.getLeft() == null) {
                return null;
            } else {
                return this.getLeft().findNode(value);
            }
        } else {
            if (this.getRight() == null) {
                return null;
            } else {
                return this.getRight().findNode(value);
            }
        }
    }

}
