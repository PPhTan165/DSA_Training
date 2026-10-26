package org.example;

import org.example.array.MergeArrSort;
import org.example.string.StringDSA;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[] nums1 = {1,2,7,0,0,0};
        int[] nums2 = {2,5,6};

        MergeArrSort mergeArr = new MergeArrSort();

        mergeArr.merge(nums1,3,nums2,3);
    }
}


