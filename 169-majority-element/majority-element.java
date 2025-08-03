class Solution {
    public int majorityElement(int[] nums) {
        // Fix 1: Move variable declaration outside loop
        int majorityElement = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            int count = 1; // Fix 2: Reset count for each element
            
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            
            if(count > nums.length / 2){
                majorityElement = nums[i]; // Fix 3: Store the majority element
                break;
            }
        }
        
        return majorityElement; // Fix 4: Return the found majority element
    }
}