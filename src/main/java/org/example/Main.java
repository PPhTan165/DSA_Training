package org.example;

import org.example.array.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[] nums1 = {1,4,3,7,3,7,8,3,8,4};
        int[] nums2 = {1,3,0,0,12};
        int[] nums3 = {-4,-1,-1,0,1,2};

        TwoPointer twoPointer = new TwoPointer();
        List<List<Integer>> results = twoPointer.threeSum(nums3);
        for (int i = 0; i < results.toArray().length; i++){
            System.out.println(results.get(i));
        }
//        int maxArea = twoPointer.maxArea(nums1);
//        System.out.println(maxArea);
//        int[] squares = twoPointer.sortedSquares(nums1);
//        System.out.print(Arrays.toString(squares);
//        int count = twoPointer.removeDuplicates(nums1);
//        twoPointer.moveZeroes(nums2);
//        System.out.println(Arrays.toString(twoPointer.twoSum(nums3, 10)));

    }
}


