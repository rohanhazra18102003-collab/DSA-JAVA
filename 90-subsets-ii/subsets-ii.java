class Solution {
    static void solve(int nums[],int idx,List<Integer> output,List <List<Integer>>ans){
        if(idx>= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int currvalue=nums[idx];
        output.add(currvalue);
        solve(nums,idx+1,output,ans);
        output.remove(output.size()-1);
        while(idx+1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }
        solve(nums,idx+1,output,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output= new ArrayList<>();
        int idx=0;
        solve(nums,idx,output,ans);
        return ans;
        
    }
}