class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
       
        int rightSum[]=new int[n];
         int left=nums[0];
         rightSum[n-1]=nums[n-1];
         for(int i=n-2;i>=0;i--)
         {
            rightSum[i]=Math.min(rightSum[i+1],nums[i]);
         }
        
         for(int i=0;i<n;i++)
         {
             left=Math.max(left,nums[i]);
            int instability=left-rightSum[i];
            if(instability<=k)
            {
                return i;
            }
         }
         return -1;

        
    }
}