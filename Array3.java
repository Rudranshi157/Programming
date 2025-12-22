public class Array3{

    //maximum subarray sum (Kadane’s Algorithm)
    public static int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE , curr=0;
        for(int i=0 ;i<nums.length ; i++){
            curr += nums[i];
            max =Math.max(max,curr);
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
    //Moore Voting Algorithm
    public static int majorityElement(int arr[]){
        int curr = 0;
        int count = 0;
        for( int num : arr){
            if(count == 0){
                curr = num;
            }
            if(curr == num){
                count++;
            }else{
                count--;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        int a[] = {3,3,5,3,2,7,3,3};
        System.out.println(majorityElement(a));
    }
}