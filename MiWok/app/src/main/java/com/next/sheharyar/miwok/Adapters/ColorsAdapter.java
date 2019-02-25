package com.next.sheharyar.miwok.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.next.sheharyar.miwok.Model.Colors;
import com.next.sheharyar.miwok.Model.Word;
import com.next.sheharyar.miwok.R;

import java.util.ArrayList;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class ColorsAdapter extends ArrayAdapter<Colors> {

    public ColorsAdapter(Context context, ArrayList<Colors> colors) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, colors);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_colors, parent, false);
        }

        Colors currentColor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultEnglishColorsText = (TextView) listItemView.findViewById(R.id.englishColorsText);
        // Get the default translation from the current currentWord object and
        // set this text on the miWok TextView
        defaultEnglishColorsText.setText(currentColor.getmEnglishColorsText());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView meWokColorsText = (TextView) listItemView.findViewById(R.id.miWokColorsText);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the defaultEnglishTxt TextView
        meWokColorsText.setText(currentColor.getmMiWokColorsText());

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView

        return listItemView;
    }
}
