class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int counter = 0, n=arr1.length;        
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                if(Math.abs(arr1[i]-arr2[j])<=d)
                    counter++;
            }
            if(counter >0){
               counter = 0;
                n--;
            }
        }
        return n;
    }
}
