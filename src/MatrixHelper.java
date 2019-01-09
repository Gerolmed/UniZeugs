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

        if(matrix == null)
            return false;

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

    /**
     * Function follows name
     * @param matrix1
     * @param matrix2
     * @return
     */
    public static int[][] entrywiseProduct(int[][] matrix1, int[][] matrix2) {
        if(!sameDimensions(matrix1, matrix2))
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

    /**
     * Multiplies each value by the given scale
     * @param matrix
     * @param scale
     * @return
     */
    public static int[][] multScalar(int[][] matrix, int scale) {

        if(!isMatrix(matrix))
            return null;

        for(int x = 0; x < matrix.length; x++) {

            //Note: you could just do < matrix[0].length, but to keep it flexible for other projects...
            for(int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] *= scale;
            }
        }
        return matrix;
    }

    /**
     * Does what it says :P
     * @param matrix1
     * @param matrix2
     * @return
     */
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

    /**
     * Multiplies to matrices. Returns null if invalid matrices
     * @param matrix1
     * @param matrix2
     * @return
     */
    public static int[][] mmult(int[][] matrix1, int[][] matrix2) {

        if(!isMatrix(matrix1) || !isMatrix(matrix2))
            return null;

        //Matrices need right format row count of m2 needs to equal column count of m1.
        if(matrix1[0].length != matrix2.length)
            return null;

        int[][] matrix = createMatrix(matrix1.length, matrix2[0].length);

        //Calculate (note: not using x and y here to prevent confusion)
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        return matrix;
    }

    /**
     * Creates a new empty matrix with the given count of rows and columns
     * @param rows
     * @param columns
     * @return
     */
    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][];

        for(int i = 0; i < matrix.length; i++)
            matrix[i] = new int[columns];

        return matrix;
    }

    /**
     * Prints out a matrix to the console
     * @param matrix
     */
    private static void printMatrix(int[][] matrix) {
        if(!isMatrix(matrix)) {
            System.out.println("Invalid Matrix");
            return;
        }

        for (int x = 0; x < matrix.length; x++) {

            //Note: you could just do < matrix[0].length, but to keep it flexible for other projects...
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Tests if the dimensions of two matrices are equal
     * @param matrix1
     * @param matrix2
     * @return
     */
    public static boolean sameDimensions(int[][] matrix1, int[][] matrix2) {
        if(!isMatrix(matrix1) || !isMatrix(matrix2))
            return false;

        return (matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length);
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {3,2},
                {0,1},
                {5,2}};
        int[][] matrix2 = {
                {1,2},
                {3,1}};

        System.out.println("Matrix 1");
        printMatrix(matrix1);
        System.out.println("Matrix 2");
        printMatrix(matrix2);

        System.out.println("Multiplication");
        printMatrix(mmult(matrix1, matrix2));
    }
}
