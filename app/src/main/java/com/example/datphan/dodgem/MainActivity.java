package com.example.datphan.dodgem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Chess> arrayList;
    public static ChessAdapter chessAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();



    }

    public void initView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvDodgem);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);

        arrayList = new ArrayList<>();
        arrayList.add(new Chess(1,1,1));
        arrayList.add(new Chess(3,1,2));
        arrayList.add(new Chess(3,1,3));
        arrayList.add(new Chess(1,2,1));
        arrayList.add(new Chess(3,2,2));
        arrayList.add(new Chess(3,2,3));
        arrayList.add(new Chess(3,3,1));
        arrayList.add(new Chess(0,3,2));
        arrayList.add(new Chess(0,3,3));
        chessAdapter = new ChessAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(chessAdapter);
    }


}
