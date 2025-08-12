class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i:nums1){
            nums.add(i);
        }
        for(int j:nums2){
            if(nums.contains(j)){
                res.add(j);
            }
        }
        int ind=0;
        int fin[]=new int[res.size()];
        for(int k:res){
            fin[ind++]=k;
        }
        return fin;

    }
}