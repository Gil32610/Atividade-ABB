package BinaryTree;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public boolean isEmpty() {
        if (this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T content) {
        Node<T> aNode = new Node<>(content);
        if (this.isEmpty()) {
            this.root = aNode;
        } else {
            this.root.insertNode(content);
        }
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void inOrder() {
        if (this.isEmpty()) {
            System.out.println("Arvore vazia");
        } else {
            percorrerEmOrdem(this.root);
        }
    }

    private void percorrerEmOrdem(Node<T> root2) {
        if (root2 != null) {
            percorrerEmOrdem(root2.getLeft());
            System.out.println(root2.getContent());
            percorrerEmOrdem(root2.getRight());
        }
    }

    public void inserir(T content) {
        Node<T> aux, novo;
        aux = this.root;
        novo = new Node<>(content);
        if (this.isEmpty()) {
            this.root = novo;
            return;
        }
        while (true) {
            if (content.compareTo(aux.getContent()) == 0) {
                System.out.println("Repeated");
                break;
            } else if (content.compareTo(aux.getContent()) < 0) { // inserção no lado esquerdo
                if (aux.getLeft() != null) {
                    aux = aux.getLeft();
                } else {
                    // inserir
                    aux.setLeft(novo);
                    break;
                }
            } else {// inserção no lado direito
                if (aux.getRight() != null) {
                    aux = aux.getRight();
                } else {
                    // inserir
                    aux.setRight(novo);
                    break;
                }
            }
        }
    }

    public void preOrdem() {
        if (this.isEmpty()) {
            System.out.println("Empty tree");
        } else {
            percorrerPreOrdem(this.root);
        }
    }

    private void percorrerPreOrdem(Node<T> root2) {
        if (root != null) {
            System.out.println(root.getContent());
            percorrerPreOrdem(root2.getLeft());
            percorrerPreOrdem(root2.getRight());
        }
    }

    public void remove(T content) {
        if (this.isEmpty()) {
            System.out.println("Empty tree!");
        } else {
            this.root = this.removeNode(this.root, content);
        }
    }

    private Node<T> removeNode(Node<T> root, T content) {
        if (root != null) {
            if (content.compareTo(root.getContent()) == 0) {
                Node<T> father, son;
                if (root.getLeft() == null && root.getRight() == null) {
                    root = null;
                } else if (root.getLeft() == null) {
                    root = root.getRight();
                } else if (root.getRight() == null) {
                    root = root.getLeft();
                } else {
                    father = root;
                    son = root.getLeft();
                    while (son.getRight() != null) {
                        father = son;
                        son = son.getRight();
                    }
                    father.setRight(son.getLeft());
                    root.setContent(son.getContent());
                }

            } else if (content.compareTo(root.getContent()) < 0) {
                root.setLeft(removeNode(root.getLeft(), content));
            } else {
                root.setRight(removeNode(root.getRight(), content));
            }
        }
        return root;
    }

}
