class Solution {
public:
    bool isPowerOfFour(int n) {
        bool ans;
        if(n <= 0)
            return false;
        if(n == 1)
            return true;
        if(n%4 == 0){
            ans = isPowerOfFour(n/4);
        }
        return ans;
    }
};
