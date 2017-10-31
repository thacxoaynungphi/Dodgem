package com.example.datphan.dodgem;

/**
 * Created by dat.phan on 17/10/2017.
 */

public class Chess {

    private int stateChess;
    private int row;
    private int column;

    public Chess(int stateChess, int row, int column) {
        this.stateChess = stateChess;
        this.row = row;
        this.column = column;
    }

    public int getStateChess() {
        return stateChess;
    }

    public void setStateChess(int stateChess) {
        this.stateChess = stateChess;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
