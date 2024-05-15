package JavaCode;

public class NqueenN {
    
    public static void placeNQueens(int n){
        int[][] board = new int[n][n];
        placeNQueensHelper(board, 0);
    }

    static void placeNQueensHelper(int arr[][], int col) {
        if (col == arr.length) {
            printBoard(arr);
            return;
        }
        for (int row = 0; row < arr.length; row++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = 1;
                placeNQueensHelper(arr, col + 1);
                arr[row][col] = 0;
            }
        }
    }

    static boolean isSafe(int row, int col, int arr[][]) {
        for (int i = 0; i < col; i++) {
            if (arr[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < arr.length && j >= 0; i++, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static void printBoard(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
}
