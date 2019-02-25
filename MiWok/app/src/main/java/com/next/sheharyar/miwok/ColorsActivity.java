package com.next.sheharyar.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.next.sheharyar.miwok.Adapters.ColorsAdapter;
import com.next.sheharyar.miwok.Adapters.CustomeAdapter;
import com.next.sheharyar.miwok.Model.Colors;
import com.next.sheharyar.miwok.Model.Word;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity  {

    private static final String TAG = "NumbersActivity";
    ArrayList<Word> colorsToAdd = new ArrayList<Word>();
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ColorsFragment())
                .commit();

//        colorsToAdd.add(new Word("red", "wetetti", R.drawable.color_red, R.raw.color_red));
//        colorsToAdd.add(new Word("green", "chokokki",R.drawable.color_green, R.raw.color_green));
//        colorsToAdd.add(new Word("brown", "takaakki", R.drawable.color_brown, R.raw.color_brown));
//        colorsToAdd.add(new Word("gray", "topoppi", R.drawable.color_gray, R.raw.color_gray));
//        colorsToAdd.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
//        colorsToAdd.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
//        colorsToAdd.add(new Word("dusty yellow", "topiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
//        colorsToAdd.add(new Word("mustard yellow", "chiwiitә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
//        colorsToAdd.add(new Word("red", "wetetti", R.drawable.color_red, R.raw.color_red));
//        colorsToAdd.add(new Word("red", "wetetti", R.drawable.color_red, R.raw.color_red));


//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootViewColors);
//
//        CustomeAdapter colorsAdapter = new CustomeAdapter(this, colorsToAdd);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(colorsAdapter);
//        listView.setOnItemClickListener(this);
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//        Word word = colorsToAdd.get(i);
//        mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
//
//        // Start the audio file
//        mediaPlayer.start();
//    }
    }
}
