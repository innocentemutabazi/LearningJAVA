class Solution {
  public int removeDuplicates(int[] nums) {
      int duplicates = 0;
    for (int num : nums){
    for (int i = 0; i<nums.length;i++){
      if (num == nums[i]){
          nums[duplicates] = nums[i];
          duplicates ++;
      }
      
    } 
    } 
    return nums.length-duplicates;
  
}}