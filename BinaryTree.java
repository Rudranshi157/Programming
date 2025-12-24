import java.util.*;
public class BinaryTree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.add(root);
        q.add(null);
        TreeNode prev=null;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                arr.add(prev.val);
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                continue;
            }
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
            prev = curr;

        }
        return arr;

    }

    //TOWER OF HANOI
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n == 1 || n==0) return n;
        int a = 1+towerOfHanoi(n-1, from, aux, to);
        return a + towerOfHanoi(n-1, aux, to, from);
    }
    public static void main(String[] args) {
        
    }
}