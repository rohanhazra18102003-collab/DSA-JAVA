class Solution {
    static int solve(int nums[], int idx, int[] memo){
        if(idx >= nums.length){
            return 0;
        }
        if(memo[idx] != -1){
            return memo[idx];
        }
        int include = nums[idx] + solve(nums, idx+2, memo);
        int exclude = 0 + solve(nums, idx+1, memo);
        int finalans = Math.max(include, exclude);
        memo[idx] = finalans;
        return finalans;
    }
    
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return solve(nums, 0, memo);
    }
}