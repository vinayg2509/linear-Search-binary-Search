package com.bridgelabz.search;

import java.util.Scanner;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter number of rows
        System.out.println("Enter row");
        int row = scanner.nextInt();

        // Prompting user to enter number of columns
        System.out.println("Enter column");
        int column = scanner.nextInt();

        // Initializing the 2D matrix
        int[][] matrix = new int[row][column];

        // Prompting user to enter all elements of the matrix
        System.out.println("Enter " + row * column + " elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Prompting user to enter the number to search
        System.out.println("Enter number to find in 2D array");
        int num = scanner.nextInt();

        // Printing the result of the search (true/false)
        System.out.println(isPresent(matrix, num));
    }


//     This method performs binary search on a 2D matrix

    private static boolean isPresent(int[][] matrix, int num) {
        // Check for null or empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Get matrix dimensions
        int row = matrix.length;
        int column = matrix[0].length;

        // Initialize binary search boundaries for a "flattened" matrix
        int left = 0;
        int right = row * column - 1;

        // Binary search loop
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert the 1D index into 2D matrix coordinates
            int midRow = mid / column;
            int midCol = mid % column;
            int midValue = matrix[midRow][midCol];

            // Check if the middle value is the target
            if (midValue == num) {
                return true;
            }
            // If mid value is greater than target, discard right half
            else if (midValue > num) {
                right = mid - 1;
            }
            // If mid value is less than target, discard left half
            else {
                left = mid + 1;
            }
        }

        // Element not found
        return false;
    }
}
