import java.util.*;
public class nQueenPrintIntegerArray {
    public static void helper(char[][] board, ArrayList<ArrayList<Integer>> allBoards, int row){
        if (row == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for (int col=0; col <board.length;col++){
            if (isSafe ( row, col, board)){
                board[row][col]='Q';
                helper(board, allBoards,row+1);
                board[row][col]='.';
            }
        }
    }
    public static void saveBoard(char[][] board, ArrayList<ArrayList<Integer>> allBoards){
        int row ;
        ArrayList<Integer> newBoard = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            row = -1;
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == 'Q')
                    row = j+1; 
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static boolean isSafe(int row, int col, char[][] board){
        //  // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // vertical
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nQueenPrintIntegerArray obj = new nQueenPrintIntegerArray();
        ArrayList<ArrayList<Integer>> allBoards = obj.nQueen(n);
        System.out.println(allBoards);
    }
}
