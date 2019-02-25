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
import com.next.sheharyar.miwok.Adapters.FamilyMembersAdapter;
import com.next.sheharyar.miwok.Model.Colors;
import com.next.sheharyar.miwok.Model.FamilyMembersModel;
import com.next.sheharyar.miwok.Model.Word;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity  {

    private static final String TAG = "FamilyMembersActivity";
    ArrayList<Word> familyToAdd = new ArrayList<Word>();
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FamilyFragment())
                .commit();

//        familyToAdd.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
//        familyToAdd.add(new Word("mother", "әta", R.drawable.family_mother, R.raw.family_mother));
//        familyToAdd.add(new Word("son", "angsi", R.drawable.family_daughter, R.raw.family_daughter));
//        familyToAdd.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
//        familyToAdd.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
//        familyToAdd.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
//        familyToAdd.add(new Word("older sister","tete", R.drawable.family_older_sister, R.raw.family_older_sister));
//        familyToAdd.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
//        familyToAdd.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
//        familyToAdd.add(new Word("grandfather", "paapa", R.drawable.family_grandfather,R.raw.family_grandfather));
//
//
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootViewColors);
//
//        CustomeAdapter familyAdapter = new CustomeAdapter(this, familyToAdd);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(familyAdapter);
//        listView.setOnItemClickListener(this);
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//        Word word = familyToAdd.get(position);
//        mediaPlayer = MediaPlayer.create(FamilyMembers.this, word.getAudioResourceId());
//
//        // Start the audio file
//        mediaPlayer.start();
//    }
    }
}