
class Solution {

    public boolean canSplit(int[] nums, int k, int limit) {
        int subarrays = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= limit) {
                currentSum += num;
            } else {
                subarrays++;
                currentSum = num;
            }

            if (subarrays > k) {
                return false;
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
