package org.example.array;

public class MergeArrSort {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[m + n];


        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
               j++;
            }

            k++;
        }

        while(i < m){
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            temp[k] = nums2[j];
            i++;
            k++;
        }

    }

    public void merge2(int[] nums1, int m, int[]nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
