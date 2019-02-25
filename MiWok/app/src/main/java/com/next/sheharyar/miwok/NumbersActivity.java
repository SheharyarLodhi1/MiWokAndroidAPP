package com.next.sheharyar.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.next.sheharyar.miwok.Adapters.CustomeAdapter;
import com.next.sheharyar.miwok.Model.Word;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private static final String TAG = "NumbersActivity";
    private MediaPlayer mediaPlayer;
    ArrayList<String> restaurantsToTry = new ArrayList<String>();
    ArrayList<Word> numbersToAdd = new ArrayList<Word>();
    int numberOfRestaurants;

    boolean userHasTry = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        //Your toolbar is now an action bar and you can use it like you always do, for example:
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        toolbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();


//        numbersToAdd.add(new Word("One", "Lutti", R.drawable.number_one, R.raw.number_one));
//        numbersToAdd.add(new Word("Two", "Otiiko", R.drawable.number_two, R.raw.number_two));
//        numbersToAdd.add(new Word("Three", "Tolookosu", R.drawable.number_three, R.raw.number_three));
//        numbersToAdd.add(new Word("Four", "Oyyisa", R.drawable.number_four, R.raw.number_four));
//        numbersToAdd.add(new Word("Five", "Massokka", R.drawable.number_five, R.raw.number_five));
//        numbersToAdd.add(new Word("Six", "Temmokka",R.drawable.number_six, R.raw.number_six));
//        numbersToAdd.add(new Word("Seven", "Kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        numbersToAdd.add(new Word("Eight", "Kawinta", R.drawable.number_eight, R.raw.number_eight));
//        numbersToAdd.add(new Word("Nine", "Wo'e",R.drawable.number_nine, R.raw.number_nine));
//        numbersToAdd.add(new Word("Ten", "Na'aacha",R.drawable.number_ten, R.raw.number_ten));


//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

//        for (int index = 0; index < numbersToAdd.size(); index ++){
//
//            Log.v(TAG, "Index: " + index + "Value: " + numbersToAdd.get(index));
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(numbersToAdd.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//
//        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
//        ArrayAdapter<String> itemsAdapter =
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbersToAdd);
//        CustomeAdapter customeAdapter = new CustomeAdapter(this, numbersToAdd);
//       ArrayAdapter<Word> customeAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbersToAdd);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
//        ListView listView = (ListView) findViewById(R.id.list);
//        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
//        listView.setAdapter(customeAdapter);
//        listView.setOnItemClickListener(this); // method call

    }

//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//        Word word = numbersToAdd.get(position);
//
//        mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
//
//        // Start the audio file
//        mediaPlayer.start();
//
//
//        Toast.makeText(getApplicationContext(),"Current Position is: " + position, Toast.LENGTH_LONG).show();
//    }
}
