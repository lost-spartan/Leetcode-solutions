class Solution {
    public int removeDuplicates(int[] nums) {
        int dupes = 0;
        
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
                dupes++;
            
            nums[i - dupes] = nums[i];
        }
        
        return nums.length - dupes;
        
        /*
        int n = nums.length;
        int l=0, r=1, k=1;
        while(r <= n-1){
            if(nums[l] != nums[r])
                k++;
            l++;
            r++;
        }
        return k;
        */
        
        /*
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                nums[i] = nums[i+1];
                if(nums[i+1] == nums[i])
                    nums[i+1] = nums[i+2];
            }
        }
        */
    }
}
