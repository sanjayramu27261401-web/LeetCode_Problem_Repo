class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                b=nums[i];
            }
            if(nums[i]==b){
                c++;
            }
            else{
                c--;
            }
        }
        return b;
    }
}