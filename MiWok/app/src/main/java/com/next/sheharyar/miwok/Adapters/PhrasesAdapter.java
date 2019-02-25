package com.next.sheharyar.miwok.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.next.sheharyar.miwok.Model.Phrases;
import com.next.sheharyar.miwok.Model.Word;
import com.next.sheharyar.miwok.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class PhrasesAdapter extends ArrayAdapter<Word> {

    public PhrasesAdapter(Context context, ArrayList<Word> phrasesList){

        super(context, 0, phrasesList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_phrases, parent, false);

        }

//        Phrases phrases = getItem(position);
        Word word = getItem(position);
        TextView defaultEnglishPhrasesTxt = (TextView) listItemView.findViewById(R.id.englishPhrasesText);
        // Get the default translation from the current currentWord object and
        // set this text on the miWok TextView
        defaultEnglishPhrasesTxt.setText(word.getmDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miWokPhraseTxt = (TextView) listItemView.findViewById(R.id.miWokPhrasesText);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the defaultEnglishTxt TextView
        miWokPhraseTxt.setText(word.getmMiWoktranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if (word.hasImage()) {
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView

            // make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
            iconView.setImageResource(word.getImageResourceId());
        } else {
            iconView.setVisibility(View.GONE); // completely hide the image ..
        }

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView

        return listItemView;
    }
}
