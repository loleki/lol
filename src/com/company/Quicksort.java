package com.company;

public class Quicksort {
    private static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    private static int partition(int[] arr, int l, int r){
        int point = arr[r];
        int i = l - 1;
        for(int j = l; j < r; j++){
            if(arr[j] < point){
                i++;
                swap(arr, j, i);}
        }
        i++;
        swap(arr, i, r);
        return i;
    }

    public static void quicksort(int[] arr, int l, int r){
        if(r - l > 1){
            int m = partition(arr, l, r);
            quicksort(arr, l, m - 1);
            quicksort(arr, m, r);
        }

    }
}
