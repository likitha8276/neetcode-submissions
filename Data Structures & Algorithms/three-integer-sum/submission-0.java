class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            int n1 = nums[i];
            int left=i+1;
            int right = nums.length-1;
            if(i>0){
            if(nums[i]==nums[i-1]) continue;
            }
            while(left<right){
                
                  int sum = nums[left]+nums[right];
                  if(sum==-n1){
                    res.add(Arrays.asList(n1,nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                  }else if (sum<-n1){
                    left++;
                  }else
                right--;
            }
        }
        return res;
    }
}
