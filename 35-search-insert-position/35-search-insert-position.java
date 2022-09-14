class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=target)
                return i;
            if(target>nums[nums.length-1])
                return nums.length;
            if(nums[i]<target && nums[i+1]>target)
                return i+1;
        }
        return 0;
            
       
        
    }
}