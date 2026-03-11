class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            max = Arrays.stream(arr,i+1,arr.length).max().orElse(-1);
            arr[i] = max;
        }
        return arr;
    }
}
