/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Fernando García
 */
public class QuickSort {

    public QuickSort() {
    }

    public ArrayList<Integer> HalfPivot(ArrayList<Integer> numbers, int i, int j) {
        if (i < j) {
            int partitionIndex = partition(numbers, i, j);
            HalfPivot(numbers, i, partitionIndex - 1);
            HalfPivot(numbers, partitionIndex + 1, j);
        }
        return numbers;
    }

    private int partition(ArrayList<Integer> arr, int begin, int end) {
        int pivot = arr.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr.get(j) <= pivot) {
                i++;

                int swapTemp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, swapTemp);
            }
        }

        int swampTemp = arr.get(i + 1);
        arr.set(i + 1, arr.get(end));
        arr.set(end, swampTemp);

        return i + 1;
    }
}
