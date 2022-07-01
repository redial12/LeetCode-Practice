class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}