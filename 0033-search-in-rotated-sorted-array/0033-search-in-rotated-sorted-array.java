class Solution {
    // Function to search target in rotated sorted array using binary search
    public int search(int[] nums, int target) {

        // Initialize search space
        int low = 0;
        int high = nums.length - 1;

        // Continue while there is still a valid search range
        while (low <= high) {

            // Calculate middle index
            int mid = (low + high) / 2;

            // If target found, return index
            if (nums[mid] == target)
                return mid;
            if (nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high = mid-1;
                }
                else {
                    low = mid +1;
                }
            }
            else {
                if(nums[mid]<target && target<=nums[high]){
                    low= mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}

            