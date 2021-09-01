package NLogNSort;

import java.util.Arrays;

public class NLogNSort {
    public void sort(int[] data){
        quicksort(data, 0, data.length - 1);
    }
    private void quicksort(int data[], int start, int end) {
        if (start < end) {

            int pivot = partition(data, start, end);
            quicksort(data, start, pivot - 1);
            quicksort(data, pivot + 1, end);
        }
    }
    private int partition(int data[], int start, int end) {
        int pivot = data[end];
        int border = start - 1;
        for (int i = start; i < end; i++) {
            if (data[i] <= pivot) {
                border++;
                swap(data, border, i);
            }
        }
        swap(data, border + 1, end);
        return border + 1;
    }


    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

