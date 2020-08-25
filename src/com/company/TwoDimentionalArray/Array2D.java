package com.company.TwoDimentionalArray;

/**
 * Each element in the array can be accessed directly by
 * A[0][0],
 * A[0][1],
 * A[0][2],
 * A[0][3],
 * A[1][0],
 * A[1][1],
 * A[1][2] and
 * A[1][3] with the corresponding value 9, 2, 6, 8, 5, 7, 1 and 3
 */
public class Array2D {
    public static void main(String[] args) {
        int[][] A = {{9, 2, 6, 8}, {5, 7, 1, 3}};
        new Array2D().traversal(A);
    }

    void traversal(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println(A[i][j]);
            }
        }
    }
}
