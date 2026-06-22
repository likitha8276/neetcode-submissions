class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(sets.contains(nums[i]))
            return nums[i];
            else
            sets.add(nums[i]);
        }
        return 0;
    }
}
