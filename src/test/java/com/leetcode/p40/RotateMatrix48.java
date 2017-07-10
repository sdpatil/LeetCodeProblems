package com.leetcode.p40;

import java.util.Arrays;

/**
 * Created by sunilpatil on 7/5/17.
 */
public class RotateMatrix48 {
    public void rotate(int[][] matrix) {
        int size = matrix.length - 1;
        int layers = matrix.length / 2;

        for (int i = 0; i < layers; i++) {
            for (int j = i; j < size - i; j++) {
                int topLeft = matrix[i][j];
                int topRight = matrix[j][size - i];
                int bottomRight = matrix[size - i][size - j];
                int bottomLeft = matrix[size -j][i];

                matrix[j][size - i] = topLeft;
                matrix[size - i][size - j] = topRight;
                matrix[size-j][i] = bottomRight;
                matrix[i][j] = bottomLeft;
            }
        }

    }

    public static void main(String[] argv) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        RotateMatrix48 problem = new RotateMatrix48();
        problem.printMatrix(matrix);
        problem.rotate(matrix);

        System.out.println("Result");
        problem.printMatrix(matrix);
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }
}
