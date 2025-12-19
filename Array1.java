package Programming;



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
    public static void main(String[] args) {
        
    }
}