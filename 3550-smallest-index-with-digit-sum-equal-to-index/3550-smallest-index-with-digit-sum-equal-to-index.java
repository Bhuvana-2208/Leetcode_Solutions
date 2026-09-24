class Solution {
    public int smallestIndex(int[] nums) {
       int small=nums[0];
       int n=nums.length;
       ;
       for(int i=0;i<n;i++)
       {
        int b=nums[i];
        int c=0;
        while(b!=0)
        {
            int d=b%10;
            b=b/10;
            c=c+d;
        }
        if(c==i)
        {
            return i;
        }
       }
       return -1;
    }
}