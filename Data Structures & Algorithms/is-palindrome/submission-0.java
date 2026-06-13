class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] sh = filtered.toCharArray();
        int left=0;
        int right=sh.length-1;
        while(left < right){
            if(sh[left]!=sh[right]){
                return false;
            }
            left++;
            right--;
        }
    return true;

    }
}