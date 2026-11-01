package org.example.array;

public class TwoPointer {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
            } else {
                swap(nums, i, j);
                i++;
                j++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return new int[]{};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            }

            if (sum > target) {
                right--;
            } else {
                left++;
            }

        }
        return new int[]{};
    }

    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0) return new int[]{};

        int left = 0;
        int right = nums.length - 1;
        int[] results = new int[nums.length];
        int index = nums.length - 1;

        while (left <= right) {
            int leftSquares = nums[left] * nums[left];
            int rightSquares = nums[right] * nums[right];
            if (leftSquares < rightSquares) {
                results[index] = rightSquares;
                index--;
                right--;
            } else {
                results[index] = leftSquares;
                index--;
                left++;
            }
        }
        return results;
    }

    //Container With Most Water
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            maxArea = Math.max(maxArea,area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    private void swap(int[] nums, int slow, int fast) {
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
    }
}
