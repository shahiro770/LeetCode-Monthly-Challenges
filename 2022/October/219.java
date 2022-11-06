/*
 * Contains Duplicate II
 * 
 * Top 96.58% (18ms)
 * 
 * Keep of map of the last time you saw the number.
 * 
 * Time Complexity: O(n)
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}