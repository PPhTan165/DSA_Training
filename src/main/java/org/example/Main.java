package org.example;

import org.example.array.TwoPointer;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[] nums1 = {1,4,3,7,3,7,8,3,8,4};
        int[] nums2 = {1,3,0,0,12};
        int[] nums3 = {2,7,11,15};

        TwoPointer twoPointer = new TwoPointer();
        int maxArea = twoPointer.maxArea(nums1);
        System.out.println(maxArea);
//        int[] squares = twoPointer.sortedSquares(nums1);
//        for(int i = 0; i< squares.length;i++){
//            System.out.print(squares[i]+ " ");
//        }
//        int count = twoPointer.removeDuplicates(nums1);
//        twoPointer.moveZeroes(nums2);
//        System.out.println(Arrays.toString(twoPointer.twoSum(nums3, 10)));

    }
}


