class Solution {
    public int maxArea(int[] heights) {
        int h1 = 0;
        int h2=heights.length-1;
        int area = Integer.MIN_VALUE;
        while(h1<h2){
            int w = h2-h1;
            int h = Math.min(heights[h1],heights[h2]);
            area = Math.max(area,w*h);
            if(heights[h1]<heights[h2] )
            h1++;
            else
            h2--;
        }
        return area;
    }
}
