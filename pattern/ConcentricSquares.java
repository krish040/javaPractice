/*
 *   **********
 *            *
 *   ******** *
 *   *      * *
 *   * **** * *
 *   * *  * * *
 *   * *    * *
 *   * ****** *
 *   *        *
 *   **********
 * 
 */


// public class Mypattern13 {
//     public static void main(String[] args) {
//         int n = 10;
//     }
// }


public class ConcentricSquares {
    public static void main(String[] args) {
        int size = 9; // Size of the pattern (should be odd)
        char[][] pattern = new char[size][size];

        // Fill the grid with spaces
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Create concentric squares
        for (int layer = 0; layer < (size + 1) / 2; layer += 2) {
            int start = layer;
            int end = size - layer - 1;

            // Top and Bottom Rows
            for (int i = start; i <= end; i++) {
                pattern[start][i] = '*'; // Top row
                pattern[end][i] = '*';   // Bottom row
            }

            // Left and Right Columns
            for (int i = start; i <= end; i++) {
                pattern[i][start] = '*'; // Left column
                pattern[i][end] = '*';   // Right column
            }
        }

        // Print the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
