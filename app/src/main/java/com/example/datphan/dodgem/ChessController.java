package com.example.datphan.dodgem;

import android.graphics.Point;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by datpq on 31/10/2017.
 */

public class ChessController {

    Point[] blackMove = {
            new Point(0, 1),
            new Point(-1, 0),
            new Point(1,0)
    };

    Point[] whiteMove = {
            new Point(-1, 0),
            new Point(0, -1),
            new Point(0, 1)
    };

    boolean stopFlagAvailable = false;

    public void removeAvailable(){
        for(int i = 0; i < MainActivity.arrayList.size(); i++){
            if(MainActivity.arrayList.get(i).getStateChess() == 2){
                MainActivity.arrayList.get(i).setStateChess(3);
                MainActivity.chessAdapter.notifyDataSetChanged();
            }
        }
    }

    public void eventMove(Chess chess){
        int x = chess.getRow();
        int y = chess.getColumn();
        int state = chess.getStateChess();

        Point[] arrMove = new Point[3];
        if(state == 1) arrMove = blackMove;
        else if (state == 0) arrMove = whiteMove;

        for (int i = 0; i < arrMove.length; i++) {
            int xx = x + arrMove[i].x;
            int yy = y + arrMove[i].y;
        }
    }


    public static void stateChess(Chess item, ImageView imgChess){
        switch (item.getStateChess()){
            case 0:
                imgChess.setImageResource(R.drawable.whitechess_icon);
                break;
            case 1:
                imgChess.setImageResource(R.drawable.blackchess_icon);
                break;
            case 2:
                imgChess.setBackgroundResource(R.color.colorPrepareBackground);
                break;
            case 3:
                imgChess.setBackgroundResource(R.color.colorBackground);
                break;
        }
    }



}
