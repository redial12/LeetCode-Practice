class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<Integer>();
        List list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            list.add(nums[i]);
        }
        
        if(list.size() == set.size())
            return false;
        return true;
    }
}