package TicTacToe;

import TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        players=new LinkedList<>();
        PieceTypeX crossPiece=new PieceTypeX();
        Player player1=new Player("player1",crossPiece);
        PieceTypeO noughtsPiece=new PieceTypeO();
        Player player2=new Player("player2",noughtsPiece);
        players.add(player1);
        players.add(player2);
        gameBoard=new Board(3);

    }

    public String startGame() {
        boolean noWinner=true;
        while (noWinner){
            Player playerTurn=players.removeFirst();
            gameBoard.printBoard();
            List<int[]> freeSpace=gameBoard.getFreeCells();
            if(freeSpace.isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println("Player:" +playerTurn.name +"  Enter row column: ");
            Scanner inputScanner=new Scanner(System.in);
            String s=inputScanner.nextLine();
            String[] values=s.split(",");
            int inputRow=Integer.valueOf(values[0]);
            int inputCol=Integer.valueOf(values[1]);


            boolean pieceAddedSuccessfully=gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner=isThereWinner(inputRow,inputCol,playerTurn.playingPiece.pieceType);
            if (winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int inputRow, int inputCol, PieceType pieceType) {
        boolean rowMatch=true;
        boolean colMatch=true;
        boolean digMatch=true;
        boolean antiDigMatch=true;

        for(int i=0;i<gameBoard.size;i++){

            if(gameBoard.board[inputRow][i]==null || gameBoard.board[inputRow][i].pieceType!=pieceType){
                rowMatch=false;
            }
        }

        for(int i=0;i<gameBoard.size;i++){
            if (gameBoard.board[i][inputCol]==null || gameBoard.board[i][inputCol].pieceType!=pieceType){
                colMatch=false;
            }
        }

        for(int i=0;i<gameBoard.size;i++){
            if (gameBoard.board[i][i]==null || gameBoard.board[i][i].pieceType!=pieceType){
                digMatch=false;
            }
        }

        for(int i=gameBoard.size-1;i>-1;i--){
            if (gameBoard.board[i][i]==null || gameBoard.board[i][i].pieceType!=pieceType){
                antiDigMatch=false;
            }
        }
        return rowMatch || colMatch || digMatch || antiDigMatch;
    }
}
