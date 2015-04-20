package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {10,3,56,2,34,1,100,75,90,44,52,15,67,14,38,23,59,20,10,98};
        Arrays.sort(a);
        binarySearch(a,34);
        binarySearch(a,100);
        binarySearch(a,0);
    }

    public static void binarySearch(int [] a, int num){
        int start = 0;
        int end = a.length-1;

        while (start <= end){
            int mid = (start+end)/2;
            int midVal = a[mid];

            if (num > midVal){
                start = mid+1;
            }else if (num < midVal){
                end = mid - 1;
            }else {
                System.out.println("Found the number at index " + mid);
                break;
            }
        }
        if (start > end)
            System.out.println("Not found");
    }
}
