class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>seen = new HashSet<>();
        for(int a : nums){
            if (!seen.add(a)){
                return true;
            }
        }
        return false;
    }
}