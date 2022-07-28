public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{22,13,52}, {34, 44, 81}, {66, 28, 19}, {12, 3, 78}};

        int[][] transposeMatrix = new int[matrix[0].length][matrix.length]; // row-col


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // matrix[0] dan matrix[i].len e kadar. --> her satir icin
                transposeMatrix[j][i] = matrix[i][j]; // col, row = row, col
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) { // satir
            for (int col : row) {  // sutun
                System.out.print(col + "  ");
            }
            System.out.println(); // new line-- \n
        }

        System.out.println();

        System.out.println("Transpose Matrix: ");
        for (int[] row : transposeMatrix) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
