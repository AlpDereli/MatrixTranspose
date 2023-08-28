import java.util.Arrays;
public class Matrix {
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] transposedMatrix = transposeMatrix(originalMatrix);

        // Print the transposed matrix
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] transposed = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }
}
