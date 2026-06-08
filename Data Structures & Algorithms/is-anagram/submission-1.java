class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hashset = new HashMap<>();
        for(char sh : s.toCharArray()){
          
            if(!hashset.containsKey(sh)){
                hashset.put(sh,1);
            }else{
                hashset.put(sh,hashset.get(sh)+1);
            }
        }
        for(char th:t.toCharArray()){
         
            if(!hashset.containsKey(th)){
                return false;
            }else{
                hashset.put(th,hashset.get(th)-1);
            }
            if(hashset.get(th)<0)
            return false;
        }
        return true;
    }
}
