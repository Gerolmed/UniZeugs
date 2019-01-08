/**
 * This is not Neo!
 */
public class MatrixHelper {

    /**
     * Tests if a matrix is a matrix ^_^
     * @param matrix
     * @return
     */
    public static boolean isMatrix(int[][] matrix) {
        int rows = matrix.length;

        //Is empty array
        if(rows == 0)
            return false;

        //Invalid rows
        for(int[] row : matrix)
            if(row == null)
                return false;

        int columns = matrix[0].length; // All other columns need to have this size

        for(int[] row : matrix)
            if(row.length != columns)
                return false;

        return true;
    }

    public static int[][] entrywiseProduct(int[][] matrix1, int[][] matrix2) {
        if(sameDimensions(matrix1, matrix2))
            return null;

        int[][] matrix = createMatrix(matrix1.length, matrix1[0].length);

        for(int x = 0; x < matrix.length; x++) {

            //Note: you could just do < matrix[0].length, but to keep it flexible for other projects...
            for(int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = matrix1[x][y] * matrix2[x][y];
            }
        }

        return matrix;
    }

    public static int[][] multScalar(int[][] matrix, int scale) {
        for(int x = 0; x < matrix.length; x++) {

            //Note: you could just do < matrix[0].length, but to keep it flexible for other projects...
            for(int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] *= scale;
            }
        }
        return matrix;
    }

    public static int frobeniusInnerProduct(int[][] matrix1, int[][] matrix2) {

        int[][] prodMatrix = entrywiseProduct(matrix1, matrix2);

        if(prodMatrix == null)
            return 0;

        int value = 0;

        for(int x = 0; x < prodMatrix.length; x++) {

            //Note: you could just do < matrix[0].length, but to keep it flexible for other projects...
            for(int y = 0; y < prodMatrix[x].length; y++) {
                value += prodMatrix[x][y];
            }
        }

        return value;

    }

    public static int[][] mmult(int[][] matrix1, int[][] matrix2) {

        if(!isMatrix(matrix1) || !isMatrix(matrix2))
            return null;

        //Assign matrices for calc
        {

        }

        int[][] matrix = createMatrix(matrix1.length, matrix1[0].length);

        //Calculate
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
    }

    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][];

        for(int i = 0; i < matrix.length; i++)
            matrix[i] = new int[columns];

        return matrix;
    }

    public static boolean sameDimensions(int[][] matrix1, int[][] matrix2) {
        if(!isMatrix(matrix1) || !isMatrix(matrix2))
            return false;

        return (matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length);
    }
}
