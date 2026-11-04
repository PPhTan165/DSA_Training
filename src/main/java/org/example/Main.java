package org.example;

import org.example.array.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[] nums1 = {2,0,2,1,1,0};
        int[] nums2 = {3,2,3,2,3};
        int[] nums3 = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] height = {4, 2, 6, 3, 2, 5};

        TwoPointer twoPointer = new TwoPointer();
            System.out.print(twoPointer.trap(height));

//        System.out.print(twoPointer.removeElement(nums2,3));

//        twoPointer.sortColors(nums1);

//        List<List<Integer>> results = twoPointer.findPairs(nums3,6);
//        for (int i = 0; i < results.toArray().length; i++){
//            System.out.println(results.get(i));
//        }


//        List<List<Integer>> results = twoPointer.threeSum(nums3);
//        for (int i = 0; i < results.toArray().length; i++){
//            System.out.println(results.get(i));
//        }
//        int maxArea = twoPointer.maxArea(nums1);
//        System.out.println(maxArea);
//        int[] squares = twoPointer.sortedSquares(nums1);
//        System.out.print(Arrays.toString(squares);
//        int count = twoPointer.removeDuplicates(nums1);
//        twoPointer.moveZeroes(nums2);
//        System.out.println(Arrays.toString(twoPointer.twoSum(nums3, 10)));

    }
}


