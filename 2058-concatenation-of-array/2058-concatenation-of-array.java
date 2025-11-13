class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] newarray = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            newarray[i] = nums[i];
            newarray[nums.length + i] = nums[i];
        }
        return newarray;
    }
}