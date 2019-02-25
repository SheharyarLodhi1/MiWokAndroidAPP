package com.next.sheharyar.miwok.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.next.sheharyar.miwok.Model.Word;
import com.next.sheharyar.miwok.NumbersActivity;
import com.next.sheharyar.miwok.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class CustomeAdapter extends ArrayAdapter<Word> implements AdapterView.OnItemClickListener {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public CustomeAdapter(Context context, ArrayList<Word> words, int colorResourceId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miWokTxt = (TextView) listItemView.findViewById(R.id.miwokText);
        // Get the default translation from the current currentWord object and
        // set this text on the miWok TextView
        miWokTxt.setText(currentWord.getmDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultEnglishTxt = (TextView) listItemView.findViewById(R.id.englishText);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the defaultEnglishTxt TextView
        defaultEnglishTxt.setText(currentWord.getmMiWoktranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if (currentWord.hasImage()) {
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView

            // make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
            iconView.setImageResource(currentWord.getImageResourceId());
        } else {
            iconView.setVisibility(View.GONE); // completely hide the image ..
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView

        return listItemView;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


        if (position == 0){

        }

//        Toast.makeText(view.getContext(),"Current Position is: " + position, Toast.LENGTH_LONG).show();
    }
}
