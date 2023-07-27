package org.example;

import java.util.Random;

public class hw1 {
    public static void main(String[] args) {
        int[] array = new int[12];
        random(array);
        print(array);
        heapSort(array);
        print(array);
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < n && arr[i] < arr[leftChild]) {
            largest = leftChild;
        }
        if (rightChild < n && arr[largest] < arr[rightChild]) {
            largest = rightChild;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void random(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(35);
        }
    }
}








