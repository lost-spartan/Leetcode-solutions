class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int num : nums){
            int t = k - num;
            int v = map.getOrDefault(t, 0);
            if(v > 0){
                map.put(t, v - 1);
                res++;
            }else{
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return res;
    }
}
