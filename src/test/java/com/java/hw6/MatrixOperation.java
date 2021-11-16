package com.java.hw6;

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][i];
        }
        return arr;
    }
    public int[] getCounterDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            arr[i] = matrix[i][matrix.length - 1 - i];
        }
        return arr;
    }
    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
       return min;
    }
    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
