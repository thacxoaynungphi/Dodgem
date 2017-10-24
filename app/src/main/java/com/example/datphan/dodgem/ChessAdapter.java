package com.example.datphan.dodgem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

/**
 * Created by dat.phan on 17/10/2017.
 */

public class ChessAdapter extends RecyclerView.Adapter<ChessAdapter.ViewHolder>{
    ArrayList<Chess> chesses;
    Context context;
    //Chess chess;
    int cellWidth;

    public ChessAdapter(ArrayList<Chess> dataChesses, Context context) {
        this.chesses = dataChesses;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.recyclerview_item,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.stateChess(chesses.get(position));
    }

    @Override
    public int getItemCount() {
        return chesses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgChess;
        private View viewContainer;

        public ViewHolder(View itemView) {
            super(itemView);
            viewContainer = itemView.findViewById(R.id.view_container);
            imgChess = (ImageView) itemView.findViewById(R.id.iv_chess);
            setLayoutSize(3);
        }

        private void setLayoutSize(int columnNumber) {
            final RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            cellWidth = (ScreenHelper.getScreenWidthInPx()) / columnNumber;
            layoutParams.height = cellWidth;
            layoutParams.width = cellWidth;
            viewContainer.setLayoutParams(layoutParams);

            setImageLayoutSize();
        }

        private void setImageLayoutSize(){
            final RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            int imageWidth = cellWidth;
            layoutParams.height = imageWidth;
            layoutParams.width = imageWidth;
            imgChess.setLayoutParams(layoutParams);
        }

        public void stateChess(Chess item){
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


}
