class Solution {
    public int solve(int n, int k){
        if(n == 1)
            return 0;
        return (solve(n-1, k) + k) % n;
      //  After the result of n-1 person 1 more removing iteration is needed.
    }
    public int findTheWinner(int n, int k) {
        int ans = solve(n, k);
        return ans + 1;
    }
}
