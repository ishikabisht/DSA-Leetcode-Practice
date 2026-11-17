class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length-1, maxWater=0 , currentArea ,width ;
        while(left < right){
            width = right - left;
            if(height[left]<height[right]){
                currentArea = height[left]*width;
                maxWater = Math.max(currentArea , maxWater);
                left++;
            }
            else {
                currentArea = height[right]*width;
                maxWater = Math.max(currentArea , maxWater);
                right--; 

            }
        }
        return maxWater;
    }
}