class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet<Character> sets = new HashSet<>();
        for(int right =0;right<s.length();right++){
            char c = s.charAt(right);
            
            while(sets.contains(c)){
                sets.remove(s.charAt(left));
                left++;
            }
            sets.add(c);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
