
import java.util.Arrays;

class RowColMatrix {
    public static void main (String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays.toString(rcmatrix(arr, 4)));
    }

    static int[] rcmatrix(int[][] Matrix, int target) {
        int row = 0;
        int col = Matrix.length-1;

        while (row < Matrix.length && col >= 0) {
            if (Matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (Matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}