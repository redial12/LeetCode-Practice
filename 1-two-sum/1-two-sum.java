class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++){
            //contains target - current number
            if(map.containsKey(target - nums[i])){
                //return index of current number and map number
                return new int[]{i, map.get(target - nums[i])};
            }else{
                //add to map and repeat
                map.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}