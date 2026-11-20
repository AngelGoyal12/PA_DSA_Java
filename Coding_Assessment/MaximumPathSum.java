import java.util.*;

public class MaximumPathSum{
    static class Node{
        long value;
        Node left, right;
        Node(long value){
            this.value = value;
        }
    }
    static long bestDown(Node node){
        if(node == null){
            return 0;
        }
        long left = bestDown(node.left);
        long right = bestDown(node.right);
        return node.value + Math.max(0, Math.max(left, right));
    }
    static long findAnswer(Node root){
        if(root == null || root.left == null || root.right == null){
            return Long.MIN_VALUE;
        }
        long left = bestDown(root.left);
        long right = bestDown(root.right);
        return left + root.value + right;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("IMPOSSIBLE");
            sc.close();
            return;
        }

        String[] values = new String[n];
        for(int i = 0; i < n; i++){
            values[i] = sc.next();
        }
        if(values[0].equals("N")){
            System.out.println("IMPOSSIBLE");
            sc.close();
            return;
        }
        Node root = new Node(Long.parseLong(values[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i < n){
            Node current = queue.poll();
            if(i < n && !values[i].equals("N")){
                current.left = new Node(Long.parseLong(values[i]));
                queue.add(current.left);
            }
            i++;
            if(i < n && !values[i].equals("N")){
                current.right = new Node(Long.parseLong(values[i]));
                queue.add(current.right);
            }
            i++;
        }
        long answer = findAnswer(root);
        if(answer == Long.MIN_VALUE){
            System.out.println("IMPOSSIBLE");
        } 
        else{
            System.out.println(answer);
        }
    }
}