/**
 * Each element in the array can be accessed directly by
 * A[0],
 * A[1],
 * A[2] and
 * A[3] with the corresponding value 9, 2, 6 and 8
 */
public class Array1D {

    public static void main(String[] args) {
        int[] A = {9, 2, 6, 8};
        new Array1D().traversal(A);
    }

    void traversal(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
