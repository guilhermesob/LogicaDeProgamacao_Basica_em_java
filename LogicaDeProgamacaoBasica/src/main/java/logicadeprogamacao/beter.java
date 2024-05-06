package logicadeprogamacao;

public class beter {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserir elementos na árvore
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Exibir a árvore em ordem
        System.out.println("Árvore em ordem:");
        bst.inorder();

        // Pesquisar por um elemento na árvore
        int key = 40;
        if (bst.search(key)) {
            System.out.println("\n" + key + " encontrado na árvore.");
        } else {
            System.out.println("\n" + key + " não encontrado na árvore.");
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
