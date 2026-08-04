class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         ArrayList<Integer> list = new ArrayList<>();
         Arrays.sort(nums);
         for(int i=1;i<nums.length;i++)
         {
            for(int j=nums[i-1]+1;j<nums[i];j++)
            {
                list.add(j);
            }
         }
         
         return list;
    }
}