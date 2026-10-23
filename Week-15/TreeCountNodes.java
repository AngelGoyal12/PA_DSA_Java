import java.util.*;
// tc - O(n), sc - O(h)  [h=height]

public class TreeCountNodes{
    static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args){
        // count(root)=1+count(left)+count(right)
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(50);
        root.left.right = new Node(60);
        root.right.left = new Node(70);
        root.right.right = new Node(80);
        System.out.println(countNodes(root));
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}