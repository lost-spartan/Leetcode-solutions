class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        int ans[] = new int[2];
        int i=0, j=nums.length - 1;
        while(i<j){
            if(nums[i]+nums[j] > target)
                j--;
            else if(nums[i]+nums[j] < target)
                i++;
            else {
                ans[0] = i;
                ans[1] = j;
            }
        }
        return ans;
        */
        if (numbers == null || numbers.length == 0)
		return null;
 
	    int i = 0;
	    int j = numbers.length - 1;
 
	    while (i < j) {
		    int x = numbers[i] + numbers[j];
		    if (x < target) {
			    ++i;
		    } else if (x > target) {
			    j--;
		    } else {
			    return new int[] { i + 1, j + 1 };
		    }
	    }
 
	    return null;
    }
}
