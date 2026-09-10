class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int big=candies[0];
        int n=candies.length;
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(candies[i]>big)
            {
                big=candies[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(candies[i]+extraCandies>=big)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}