class Solution {
    public int[] twoSum(int[] nums, int target) {
      int l=0;
      int r=nums.length-1;
      while(l<r)
    {
        if(nums[l]+nums[r]!=target)
        {
            r--;
        }
        if(l==r)
        {
            l++;
            r=nums.length-1;
        }
        else if(nums[l]+nums[r]==target)
        {
            return new int[]{l,r};
        }
        
        
    }
    return new int[]{0,0};
      
    }
}