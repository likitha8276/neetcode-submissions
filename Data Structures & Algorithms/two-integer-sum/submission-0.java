class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cp = target-nums[i];
            if(hm.containsKey(cp)){
                return new int[]{hm.get(cp),i};
            }else{
                hm.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
