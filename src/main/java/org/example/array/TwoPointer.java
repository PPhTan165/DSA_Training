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

    private void swap(int[] nums, int slow, int fast) {
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
    }
}
