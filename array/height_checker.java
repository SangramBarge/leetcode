class Solution {
    public int heightChecker(int[] heights) {
     int length = heights.length;
     int[] oldArray = new int[length];
     
     for(int i=0;i< heights.length;i++){
         oldArray[i] = heights[i];
     }   
     int ans=0;
     Arrays.sort(heights);
     for(int i=0;i< heights.length;i++){
         if(oldArray[i]!=heights[i]) ans+=1; 
     }   
        return ans;
    }
 
}
