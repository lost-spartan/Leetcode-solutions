import java.lang.*;
import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length - 1;
        while(k > 0){
            Arrays.sort(gifts);
            gifts[n] = (int)Math.sqrt(gifts[n]);
            k--;
        }

        long sum = 0;
        for(int i=0; i<gifts.length; i++){
            //System.out.println(gifts[i]);
            sum = sum + gifts[i];
        }
        return sum;
    }
}
