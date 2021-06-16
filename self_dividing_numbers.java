class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=left;i<=right;i++){
            if(isDivided(i)){
                result.add(i);
            }
        }      
        return result;
    }


    public boolean isDivided(int i){
        int n = i;
            while(n>0){
                int val = n %10;
                if(val==0 ||  i % val !=0){
                    return false;
                }
                n = n/10;
            }
            return true;
        }
    }

