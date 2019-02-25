package com.next.sheharyar.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.next.sheharyar.miwok.Adapters.CustomeAdapter;
import com.next.sheharyar.miwok.Model.Word;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity  {

    private static final String TAG = "PhrasesActivity";
    ArrayList<Word> phrasesToAdd = new ArrayList<Word>();
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PhrasesFragment())
                .commit();

//        phrasesToAdd.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
//        phrasesToAdd.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
//        phrasesToAdd.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
//        phrasesToAdd.add(new Word("i am feeling good ", "kuchi achit", R.raw.phrase_im_feeling_good));
//        phrasesToAdd.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
//        phrasesToAdd.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
//        phrasesToAdd.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
//        phrasesToAdd.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootViewPhrases);
//
////        PhrasesAdapter phrasesAdapter = new PhrasesAdapter(this, phrasesToAdd);
//        CustomeAdapter customeAdapter = new CustomeAdapter(this, phrasesToAdd);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(customeAdapter);
//        listView.setOnItemClickListener(this);
//
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//        Word word = phrasesToAdd.get(position);
//        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
//
//        // Start the audio file
//        mediaPlayer.start();
//    }
    }
}
