package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String [][] board;

    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
        this.board=board;
    }

    public String[] getRow(Integer value) {
        return board [value];
    }

    public String[] getColumn(Integer value) {
        // match up the index to the value each time to get the correct column
        String [] column = { board[0][value],board[1][value],board[2][value]};

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        if (!(board[rowIndex] == board[1])) {
            return false;
        }
        if ((board[rowIndex] == board[rowIndex + 1])) {

        }
        return true;
    }


    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
