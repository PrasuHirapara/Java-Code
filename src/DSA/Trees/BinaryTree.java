package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private static int index = -1;
    private class Node{
        private int data;
        private Node left,right;

        private Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree t = new BinaryTree();

        Node root = t.buildTree(arr);
        System.out.println(root.data);

        System.out.println(t.sumOfNodes(root));

    }
    public Node buildTree(int[] nodes){
        index++;

        if(nodes[index] == -1){
            return null;
        }

        Node node = new Node(nodes[index]);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);

        return node;
    }

    public void preorder(Node root){ // O(N)
        /*
            Root
            Left
            Right
        */
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){ // O(N)
        /*
            Left
            Root
            Right
        */
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void postorder(Node root){ // O(N)
        /*
            Left
            Right
            Root
        */
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println("");
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);

        return leftNodes + rightNodes + root.data;
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight,rightHeight) +1;
    }
}
