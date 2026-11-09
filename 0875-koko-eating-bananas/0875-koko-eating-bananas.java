class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int start = 0 , end = 0 , mid , ans=0 ,  n = piles.length;
       long sum = 0 ;
      for (int i =0 ; i < n ; i++){
        sum += piles[i];
        end = Math.max(end, piles[i]);
      }  
     start = (int)(sum/h);
      if (start == 0){
        start += 1;
      }
      while(start<=end){
        mid = start + (end - start)/2;
        long total_time = 0;
        for (int i = 0; i<n; i++){
             total_time +=(piles[i]+ mid -1)/mid;
        
        }
        if (total_time > h){
            start = mid +1;
        }
        else{
            ans = mid;
            end = mid -1;
        }

      }
     return ans;
    }
}