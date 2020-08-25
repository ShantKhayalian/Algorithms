package binarySearch;

/**
 * What is Binary Search Algorithm
 * Binary Search is an algorithm for finding the position of a target value within a sorted array
 *
 * How Binary Search works
 * Binary Search works on sorted array. Let’s say you have a sorted array A,
 * middle element is AM, target value is T. The algorithm will compare AM with T
 *
 * If AM = T, return position of AM
 * If AM < T, the search continues with the lower half of the array A
 * If AM > T, the search continues with the upper half of A
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8};
        System.out.println(binarySearch(6, A));
    }

    public static int binarySearch(int T, int[] A) {
        int N = A.length;
        int L = 0;
        int R = N - 1;

        while (L <= R) {
            int M = (int) Math.floor((L + R) / 2);
            if (A[M] < T)
                L = M + 1;
            else if (A[M] > T)
                R = M - 1;
            else
                return M;
        }
        return -1;
    }
}
