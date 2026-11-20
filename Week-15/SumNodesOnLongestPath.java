import java.util.*;

class Solution {
    int maxSum = 0;
    int maxLength = 0;
    void solve(Node root, int length, int sum){
        if(root == null){
            return;
        }
        length++;
        sum += root.data;
        if(root.left == null && root.right == null){
            if(length > maxLength){
                maxLength = length;
                maxSum = sum;
            }
            else if(length == maxLength){
                maxSum = Math.max(maxSum, sum);
            }
            return;
        }
        solve(root.left, length, sum);
        solve(root.right, length, sum);
    }
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        maxLength = 0;
        maxSum = 0;
        solve(root, 0, 0);
        return maxSum;
    }
}