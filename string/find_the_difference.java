class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        
        for(int i=0;i<t.length();++i){
            char c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c) ==0){
                return c;
            }else {
                map.put(c, map.get(c) -1);
            }
        }
        char blank = ' ';
        return blank;
    }
}
