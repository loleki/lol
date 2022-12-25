package com.company;

import com.company.huffman.Huffman;
import com.company.list1.MyList;
import com.company.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {3, 5, 1, 5 ,2 ,4, 9, 5};
//        HeapSort.heapSort(arr);
//        for(int i: arr){System.out.println(i);}
        Huffman.createTree("javapoint");
    }

    public static void mergeSort(int[] mas, int n){
        if(n < 2) return;
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = mas[i];
        }
        for(int i = mid; i < n; i++){
            right[i - mid] = mas[i];
        }

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(mas, left, right, mid, n - mid);
    }

    public static void merge(int[] mas, int[] left, int[] right, int n_left, int n_right){
        int i = 0, j = 0, k = 0;
            while (i < n_left && j < n_right) {
                if (left[i] <= right[j]) {
                    mas[k++] = left[i++];
                }
                else {
                    mas[k++] = right[j++];
                }
            }
            while (i < n_left) {
                mas[k++] = left[i++];
            }
            while (j < n_right) {
                mas[k++] = right[j++];
            }

    }
}
