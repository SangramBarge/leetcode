class Solution {
    public int bitwiseComplement(int n) {
        
        if(n==1){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        //convert to binary and store in arraylist
        int index=0;
        List<Integer> a = new ArrayList<Integer>();
        while(n>0){
         a.add(index++,n%2) ;  
        
         n=n/2;   
        }
       
       for(int i=0;i<a.size();i++)
            if(a.get(i)==0)
                a.set(i,1); //update value in list
            else
                a.set(i,0);

        int sum=0;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)==1){
                sum += (int)Math.pow(2,i); 
            }
        }
        return sum;
    }
}
