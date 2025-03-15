// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int findOccurance(int[] nums, int target, boolean firstOccurance) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                    end = mid - 1;
                else {
                    ans = mid;
                    if (firstOccurance)
                        end = mid - 1;
                    else
                        start = mid + 1;
                }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstOccurance = findOccurance(nums, target, true);
        int lastOccurance = findOccurance(nums, target, false);
        return new int[] { firstOccurance, lastOccurance };
    }
}
