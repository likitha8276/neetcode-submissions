class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
      int  longeststreak = 0 ;
        Set<Integer> sets = new HashSet<>();
        for(int num : nums){
            sets.add(num);
        }
        for(int num : sets){
            if(!sets.contains(num-1)){
                int currentnum = num;
                int currentStreak = 1;
                while (sets.contains(num + 1)) {
                    num += 1;
                    currentStreak += 1;
                }
                longeststreak = Math.max(longeststreak, currentStreak);
            }
        }
        return longeststreak;
    }
}
