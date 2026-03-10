class Solution {
    public int[] getConcatenation(int[] nums) {
        int k = nums.length;
        int n=k;
        int newarr[] = new int[k+k];
        for(int i=0;i<n;i++)
        {
            newarr[i] = nums[i];
            newarr[k++] = nums[i];
        }
        return newarr;
    }
}
