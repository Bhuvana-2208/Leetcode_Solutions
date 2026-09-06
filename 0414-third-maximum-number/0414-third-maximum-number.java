class Solution {
    public int thirdMax(int[] nums) {
          Arrays.sort(nums);
          int n=nums.length;
          int big1=nums[n-1];
          int big2=0;
          int index=0;
          for(int i=n-2;i>=0;i--)
          {
            if(nums[i]<big1)
            {
                big2=nums[i];
                index=i;
                break;
            }
          }
          for(int i=index-1;i>=0;i--)
          {
            if(nums[i]<big2)
            {
                return nums[i];
            }
          }
          return big1;

    }
}