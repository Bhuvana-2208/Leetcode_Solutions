class Solution {
    public int[] shortestToChar(String s, char c) {
       int answer[]=new int[s.length()];
       int j=-(s.length());
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)==c)
        {
           j=i; 
        }
        answer[i]=Math.abs(i-j);
       } 
       j=2*(s.length());
       for(int i=s.length()-1;i>=0;i--)
       {
        if(s.charAt(i)==c)
        {
            j=i;
        }
        answer[i]=Math.min(answer[i],j-i);
       }
       return answer;
    }
}