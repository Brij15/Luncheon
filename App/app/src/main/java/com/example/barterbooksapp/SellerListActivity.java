package com.example.barterbooksapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SellerListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<String> titles;
    private List<String> authors;
    private List<Integer> images;

    private SellerRecycleViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_list_main);

        //Remove action bar
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        recyclerView = findViewById(R.id.recyclerView);
        titles = new ArrayList<>();
        images = new ArrayList<>();
        authors = new ArrayList<>();

        images = initializeTestImages(images);
        authors = initializeTestAuthors(authors);
        titles = initializeTestTitles(titles);

        adapter = new SellerRecycleViewAdapter(this, titles, authors, images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapter);
    }

    private List<Integer> initializeTestImages(List<Integer> imageList){
        imageList.add(R.drawable.book1);
        imageList.add(R.drawable.book2);
        imageList.add(R.drawable.book3);
        imageList.add(R.drawable.book4);
        imageList.add(R.drawable.book5);
        imageList.add(R.drawable.book6);
        imageList.add(R.drawable.book7);
        imageList.add(R.drawable.book8);
        return imageList;
    }

    private List<String> initializeTestTitles(List<String> titlesList){
        //initialize images TEST only
        titlesList.add("Gardens Of The moon");
        titlesList.add("Algebra and Geometry");
        titlesList.add("Mathematics and The Real World");
        titlesList.add("Fifth Season");
        titlesList.add("Name of the Wind");
        titlesList.add("What IF");
        titlesList.add("Deep Learning With Python");
        titlesList.add("Wise Man's Fear");

        return titlesList;
    }

    private List<String> initializeTestAuthors(List<String> authorList){
        //initialize images TEST only
        authorList.add("Steven Erikson");
        authorList.add("Mark V. Lawson");
        authorList.add("Zvi Artstein");
        authorList.add("N. K Jemsin");
        authorList.add("Patrick Rothfuss");
        authorList.add("Randall Munroe");
        authorList.add("François Chollet");
        authorList.add("Patrick Rothfuss");

        return authorList;
    }
}