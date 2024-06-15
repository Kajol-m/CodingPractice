class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        
        
        //int f=0,l=0;
        for(int i=0;i<height.length;i++){
            int temp=height[i];
            int step=0;
            int area=0;
            for(int j=i+1;j<height.length;j++){
               step++;
               area=Math.min(height[j],temp)*step;
               maxarea=Math.max(maxarea,area);
            }
        }
        return maxarea;
        
    }
}
//Time limit exceeds
