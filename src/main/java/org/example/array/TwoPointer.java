package org.example.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    //3Sum
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        // i không cần chạy hết length vì 2 phần từ sau là left và right để tạo bộ 3.
        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    results.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));
                    left++;
                    right--;

                    //check duplicate left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    //check duplicate right
                    while (right > left && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return results;
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == val) {
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        return left;
    }

    public List<List<Integer>> findPairs(int[] nums, int target) {
        if (nums.length == 0) return new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        List<List<Integer>> results = new ArrayList<>();

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                results.add(Arrays.asList(
                        nums[left],
                        nums[right]
                ));
                left++;
                right--;

                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }

            }
        }
        return results;
    }

    public void sortColors(int[] nums) {
        if (nums.length == 0) return;

        int left = 0;
        int right = nums.length - 1;
        int cur = 0;
        while (cur <= right) {
            if (nums[cur] == 0) {
                swap(nums, left, cur);
                left++;
                cur++;
            } else if (nums[cur] == 2) {
                swap(nums, right, cur);
                right--;

            }else{
                cur++;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private void swap(int[] nums, int slow, int fast) {
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
    }
}
