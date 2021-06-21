class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> val = new ArrayList<Integer>();
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        if(nums.length == 1) return nums[0];
        
        for(Integer i : nums){
            if(!count.containsKey(i)){
                count.put(i,count.getOrDefault(i,0)+1);
            } else{
                 count.put(i,count.get(i) +1);
            }
        }
        
         for(Integer i : nums){
            if(count.get(i) < 2) {
                return i;
            }
        }
        return -1;
    }
}
