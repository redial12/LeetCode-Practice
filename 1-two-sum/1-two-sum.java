class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                //if at first number just add to map and move on
                map.put(nums[i], i);
            }else{
                //contains target - current number
                if(map.containsKey(target - nums[i])){
                    //return index of current number and map number
                    return new int[]{i, map.get(target - nums[i])};
                }else{
                    //add to map and repeat
                    map.put(nums[i], i);
                }
            }
        }
        return new int[]{0,0};
    }
}