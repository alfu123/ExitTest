package TicTacToe.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];

    }


    public void printBoard() {
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.println(board[i][j].pieceType.name()+"   ");
                }
                else{
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

    public List<int []> getFreeCells() {
        List<int[]> freeCells=new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if (board[i][j]==null){
                    freeCells.add(new int[]{i,j});
                }
            }
        }
        return freeCells;
    }

    public boolean addPiece(int inputRow, int inputCol, PlayingPiece playingPiece) {
        if(board[inputRow][inputCol]!=null){
            return false;
        }
        board[inputRow][inputCol]=playingPiece;
        return true;
    }
}
