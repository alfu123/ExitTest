package SnakeLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    public Cells[][] cell;

    public Board(int boardSize, int noOfSnake, int noOfLadder) {
        initialisedBoard(boardSize);
        addSnakeLadder(cell,noOfSnake,noOfLadder);

    }

    private void addSnakeLadder(Cells[][] cells, int noOfSnake, int noOfLadder) {

        while(noOfSnake>0){
            int SnakeHead= ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int SnakeTail=ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(SnakeTail>=SnakeHead){
                continue;
            }
            Jump snakeObj=new Jump();
            snakeObj.start=SnakeHead;
            snakeObj.end=SnakeTail;

            Cells cell=getCell(SnakeHead);
            cell.jump=snakeObj;
            noOfSnake--;

        }
        while (noOfLadder>0){
            int LadderStart= ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int LadderEnd=ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(LadderStart>=LadderEnd){
                continue;
            }
            Jump ladderObj=new Jump();
            ladderObj.start=LadderStart;
            ladderObj.end=LadderEnd;

            Cells cell=getCell(LadderStart);
            cell.jump=ladderObj;
            noOfLadder--;
        }
    }

    public Cells getCell(int playerPos) {
        int row = playerPos / cell.length;
        int col = playerPos % cell.length;
        return cell[row][col];
    }

    private void initialisedBoard(int boardSize) {
        cell=new Cells[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cells cellObj = new Cells();
                cell[i][j]=cellObj;
            }
        }
    }


}
