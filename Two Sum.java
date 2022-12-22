class Solution {
    public int[] twoSum(int[] nums, int target) {
      //First Attempt
        /*Arrays.sort(nums);
        int i=0, j=nums.length - 1;
        int ans[] = new int[2];
        while(i<j){
            if(nums[i]+nums[j] > target)
                j--;
            else if(nums[i]+nums[j] < target)
                i++;
            else if(nums[i]+nums[j] == target){
                ans[0] = i;
                ans[1] = j;
            }
        }*/
        int ans[] = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
