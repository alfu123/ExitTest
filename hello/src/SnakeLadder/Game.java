package SnakeLadder;

import SnakeLadder.Model.Board;
import SnakeLadder.Model.Cells;
import SnakeLadder.Model.Dice;
import SnakeLadder.Model.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;
    Player winner;
    Deque<Player> playerList=new LinkedList<>();

    public Game() {
        initilisedGame();

    }

    private void initilisedGame() {
        board=new Board(30,10,10);
        dice=new Dice(1);
        Player player1=new Player("p1",0);
        Player player2=new Player("p2",0);
        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame(){

        while (winner==null){
            Player playerTurn=playerList.removeFirst();
            System.out.println("Player Turn"  + playerTurn.id + "  Player Position  "+playerTurn.currPos);
            int diceNo=dice.rolledDice();
            int playerPos=playerTurn.currPos+diceNo;
            playerPos=jumpCheck(playerPos);
            playerTurn.currPos=playerPos;
            if (playerTurn.currPos>=board.cell.length*board.cell.length-1){
                winner=playerTurn;
            }
            playerList.addLast(playerTurn);
        }
        System.out.println("winner is  "+ winner.id);
    }

    private int jumpCheck(int playerPos) {
        if(playerPos>board.cell.length*board.cell.length-1){
            return playerPos;
        }
        Cells cell=board.getCell(playerPos);
        if(cell.jump!=null && cell.jump.start==playerPos ){
            String jumpBy=(cell.jump.start>cell.jump.end)?"Snake":"Ladder";
            System.out.println("Jumb By   "+ jumpBy);
            return cell.jump.end;
        }
        return playerPos;
    }
}
