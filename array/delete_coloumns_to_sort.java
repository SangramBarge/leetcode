class Solution {
    public int minDeletionSize(String[] strs) {
     
        int m = strs[0].length(); //cols
        
        int ans=0;
        
        for(int i=0;i< m;i++){
            for(int j=1;j< strs.length;j++){
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    ans+=1;
                    break;
                }
            }
        }
        return ans;
    }
}
