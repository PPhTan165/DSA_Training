package org.example.array;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public int searchRotated(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(pile, high);
        }
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEatAll(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return result;
    }

    private boolean canEatAll(int[] piles, int h, int speed) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
            if (totalHours > h) return false;
        }
        return totalHours <= h;
    }

    public int splitArray(int[] nums, int k) {
        if (nums.length == 0) return -1;
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(num, left);
            right += num;
        }
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int sum = 0, groups = 1;
        for (int num : nums) {

            if (sum + num > maxSum) {
                sum = num;
                groups++;
                if (groups > k) {
                    return false;
                }
            } else {
                sum += num;
            }
        }
        return true;
    }

}
