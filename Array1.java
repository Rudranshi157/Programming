package Programming;
import java.util.*;


public class Array1{
    //2091. Removing Minimum and Maximum From Array
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1 ) return 1;
        int imax=0 , imin=0, high ,low;
        for(int i=0; i<nums.length; i++){
            imax = nums[imax]<nums[i]? i:imax;
            imin = nums[imin]>nums[i]? i:imin;
        }
        if(imax > imin){
            high = imax;
            low = imin;
        }else{
            high = imin;
            low = imax;
        }
        return Math.min(nums.length-low , Math.min(high+1 , nums.length-high+low+1));
    }

    //1480. Running Sum of 1d Array
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }

    //3005. Count Elements With Maximum Frequency
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);
                
            }else{
                h.put(nums[i],1);
                max = Math.max(max , h.get(nums[i]));
            }
            if(max < h.get(nums[i])){
                max = h.get(nums[i]);
                res = max;
            }else if(max == h.get(nums[i])){
                res += max;
            }
        }
        
        return res;
    }

    // 189. Rotate Array
    public static void reverse(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
    public void rotate(int[] nums, int k) {
        reverse(nums , 0 , nums.length-1);
        reverse(nums , 0 , (k%nums.length)-1);
        reverse(nums ,  (k%nums.length) , nums.length-1);
    }

    // 26. Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
       int idx=0;
       for(int i=0; i<nums.length; i++){
            while(nums.length>i+1 && nums[i]==nums[i+1]){
                i++;
            }
            nums[idx]= nums[i];
            idx++;
       }
       return idx;
    }
    
    public static void main(String[] args) {
        
    }
}