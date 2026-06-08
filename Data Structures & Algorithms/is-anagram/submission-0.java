class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!charMap.containsKey(ch)){
                charMap.put(ch,1);
            }else{
                charMap.put(ch,charMap.get(ch)+1);
            }
        }
        for(int i=0;i<t.length();i++){
         char  th = t.charAt(i);
            if(!charMap.containsKey(th) || charMap.get(th)==0){
                return false;
            }
            charMap.put(th,charMap.get(th)-1);
        }
        return true;
    }
}
