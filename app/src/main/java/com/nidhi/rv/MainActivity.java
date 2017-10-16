package com.nidhi.rv;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nidhi.rv.adapters.ItemsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context = MainActivity.this;

    private String name  = "nidhishpatel";

    private RecyclerView recyclerView;

    private ArrayList titlesList = new ArrayList();

    private ArrayList descList = new ArrayList();

    private int[] imagesList = {R.mipmap.a,R.mipmap.b,R.mipmap.c,R.mipmap.d,R.mipmap.e,R.mipmap.f,
            R.mipmap.g,R.mipmap.h,R.mipmap.a,R.mipmap.b,R.mipmap.c,R.mipmap.d,R.mipmap.e,R.mipmap.f,
            R.mipmap.g};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerviewId);
        //mandatory append LayoutManager Object, to align items vertical or horizintal.
        //we have two LayoutManagers namely called LinearLayoutManager and GridLayoutManager.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,1);

        recyclerView.setLayoutManager(gridLayoutManager);

        titlesList.add("Alpha(Astro)");
        titlesList.add("Beta(Bender)");
        titlesList.add("Cupcake");
        titlesList.add("Donut");
        titlesList.add("Éclair");
        titlesList.add("Froyo");
        titlesList.add("GingerBread");
        titlesList.add("HoneyComb");
        titlesList.add("Icecreamsandwitch");
        titlesList.add("JellyBean");
        titlesList.add("Kitkat");
        titlesList.add("Lollipop");
        titlesList.add("Marshmallow");
        titlesList.add("Nougat");
        titlesList.add("O");



        descList.add("Version 1.0");
        descList.add("Version 2.0");
        descList.add("Version 3.0");
        descList.add("Version 4.0");
        descList.add("Version 5.0");
        descList.add("Version 6.0");
        descList.add("Version 7.0");
        descList.add("Version 8.0");
        descList.add("Version 9.0");
        descList.add("Version 10.0");
        descList.add("Version 11.0");
        descList.add("Version 12.0");
        descList.add("Version 13.0");
        descList.add("Version 14.0");
        descList.add("Version 15.0");


        recyclerView.setAdapter(new ItemsAdapter(context,titlesList,descList,imagesList));



    }
}
