class Solution {
    public boolean hasDuplicate(int[] nums) {
        int freq[] = new int[10];
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
            if(nums[i]==nums[j]&&i!=j) return true;
           }
        }
        return false;
}
}
