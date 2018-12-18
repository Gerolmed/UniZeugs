import java.util.Arrays;

public class Pascal {

    public static int[][] createPascal(int numOfRows) {
        int[][] matrix = new int[numOfRows][];

        //Create empty matrix
        for(int i = 1; i <= numOfRows; i++)
            matrix[i-1] = new int[i];

        //Add 1 values to start and end of every sub-array
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 1;
            matrix[i][i] = 1;
        }

        //Now add them beginning at the 3 sub array
        for(int i = 1; i < matrix.length; i++) {
            for (int x = 1; x < i; x++) {
                matrix[i][x] = matrix[i-1] [x-1] + matrix[i-1] [x];
            }
        }

        return matrix;
    }

    public static void drawTriangle(int[][] triangle) {
        for(int i = 0; i < triangle.length; i++) {
            String line = toLine(triangle[i]);

            int space = ((toLine(triangle[triangle.length-1]).length() -1)+line.length())/2;

            System.out.printf("%"+(space > 0 ? space : "")+"s\n", line);
        }
    }

    private static String toLine(int[] array) {
        String line = "";
        for(int x = 0; x < array.length; x++) {
            line = line + array[x] + " ";
        }

        line = line.substring(0, line.length()-1);

        return line;
    }

    public static void main(String[]args) {
        drawTriangle(createPascal(10));
    }
}
