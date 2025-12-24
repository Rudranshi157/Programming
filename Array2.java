
import java.util.HashSet;

public class Array2{
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

    //Find all repeating elements in an array
    public static void findRepeatingEle(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(!h.contains(arr[i])){
                h.add(arr[i]);
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int Arr[] = {1,1,2,3,4,4,5,2};
        int arr2[] = {1,1,0};
        findRepeatingEle(arr2);
        
    }
}