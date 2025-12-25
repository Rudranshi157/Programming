public class LinkedList{
    class Node{
        int val;
        Node next;
        void Node(int val){
            this.val = val;
        }
    }
    //searching elements in a matrix 
    // time complexity O(n+m)
    // space complexity O(1)
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0 , j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            int val = matrix[i][j];
            if(val == target){
                return true;
            }else if(val > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }


    //Printing elements in sorted order
    //Time complexity O(nlogn)
    //Space Complexity O(n)
    public int[] mergeSort(int s, int e, int[] nums){
        if(s == e) return nums;
        int mid = (e - s)/2 + s;
        mergeSort(s, mid, nums);
        mergeSort(mid+1, e, nums);
        return merge(s, mid+1, e, nums);
    }
    public int[] merge(int s, int s2, int e, int[] nums){
        int i=s, j=s2, k=0;
        int[] t = new int[e-s+1];
        while(i<s2 && j<=e){
            t[k++] = (nums[i]<nums[j])? nums[i++] : nums[j++];
        }
        while(i<s2){
            t[k++] = nums[i++];
        }
        while(j<=e){
            t[k++] = nums[j++];
        }

        for(int v=0; v<t.length; v++){
            nums[s++] = t[v];
        }
        return nums;
    }
    public int[] sortArray(int[] nums) {
        if(nums.length == 1) return nums;
        int s =0 , e = nums.length-1;
        return mergeSort(s, e, nums);
        
    }

    //identifying rows with maximum 1s
    // time complexity O(m*n)
    //Space complexity O(1)
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row =0;
        int count = 0;
        for(int i = mat.length-1; i>=0; i--){
            int c=0;
            for(int j =0; j<mat[0].length; j++){
                if(mat[i][j] == 1) c++;
            }
            if(count <= c){
                count = c;
                row = i;
            }
        }
        int ans[] = {row, count};
        return ans;
    }

    //237. Delete Node in a Linked List

    // approach 1
    // tc O(n) 
    //sc O(1)
    public void deleteNode(Node node) {
        Node prev = null;
        while(node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }

    //approach 2
    //tc O(1)
    //sc O(1)
    public static void deleteNode2(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String args[]){

    }
}