class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1, new_water = 0, old_water = 0;
        while(left<right){
            new_water = (right-left) * Math.min(height[left], height[right]);
            if(new_water >= old_water)
                old_water = new_water;
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return old_water;
    }
}
