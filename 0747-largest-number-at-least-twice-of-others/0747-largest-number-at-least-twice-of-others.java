class Solution {
    public int dominantIndex(int[] nums) {
       int big=0;
       int n=nums.length;
       int index=0;
       for(int i=0;i<n;i++)
       {
        if(nums[i]>big)
        {
            big=nums[i];
            index=i;
        }
       } 
       for(int i=0;i<n;i++)
       {
        if(big<2*nums[i])
        {
            if(i==index)
            {
                continue;
            }
            else 
            {
                return -1;
            }
        }
       }
       return index;
    }
}