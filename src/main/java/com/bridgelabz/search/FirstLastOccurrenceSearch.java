package com.bridgelabz.search;

import java.util.Scanner;

public class FirstLastOccurrenceSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: array size
        System.out.println("Enter size of an array");
        int size = scanner.nextInt();

        int[] a = new int[size];

        // Input: array elements
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        // Input: target number
        System.out.println("Enter target number");
        int target = scanner.nextInt();

        // Get first and last occurrence
        int[] result = findFirstAndLastOccurrence(a, target);

        // Output result
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    // Wrapper method to return both first and last occurrence as array
    private static int[] findFirstAndLastOccurrence(int[] a, int target) {
        int firstOccurrence = findFirstOccurrence(a, target);
        int lastOccurrence = findLastOccurrence(a, target);
        return new int[]{firstOccurrence, lastOccurrence};
    }

    // Finds the first index where target appears
    private static int findFirstOccurrence(int[] a, int target) {
        int result = -1, left = 0, right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                result = mid;
                right = mid - 1; // Search on the left side
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Finds the last index where target appears
    private static int findLastOccurrence(int[] a, int target) {
        int result = -1, left = 0, right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                result = mid;
                left = mid + 1; // Search on the right side
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
