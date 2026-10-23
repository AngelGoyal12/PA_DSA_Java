import java.util.*;
// tc - O(n), sc - O(h)

public class TreeHeight{
    static int height(Node root){
        if(root == null){
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(50);
        root.left.right = new Node(60);
        root.right.left = new Node(70);
        root.right.right = new Node(80);
        System.out.println("Height = " + height(root));
    }
}
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}