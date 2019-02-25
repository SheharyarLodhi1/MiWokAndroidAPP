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

import com.next.sheharyar.miwok.Model.FamilyMembersModel;
import com.next.sheharyar.miwok.Model.Word;
import com.next.sheharyar.miwok.R;

import java.util.ArrayList;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class FamilyMembersAdapter extends ArrayAdapter<FamilyMembersModel> {

    public FamilyMembersAdapter(Context context, ArrayList<FamilyMembersModel> familyMembersList) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, familyMembersList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // ViewGroup is the parent view and which is a listview
        // now the purpose of getview method is to return a list item view and return it to listview
        // here inflate means we create a new layout from below xml resource shich is list_item_family_members and we are going to store this into listview variable
        View listView = convertView;
        if (listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_family_members, parent, false);

        }

        // get the {@link FamilyMembersMoidel} object located at this position in the list..
        FamilyMembersModel familyMembersModel = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultEnglishFamilyTxt = (TextView) listView.findViewById(R.id.englishFamilyText);
        // Get the default translation from the current currentWord object and
        // set this text on the miWok TextView
        defaultEnglishFamilyTxt.setText(familyMembersModel.getmEnglishFamilyText());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miWokEnglishFamilyTxt = (TextView) listView.findViewById(R.id.miWokFamilyText);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the defaultEnglishTxt TextView
        miWokEnglishFamilyTxt.setText(familyMembersModel.getmMiWokFamilyText());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(familyMembersModel.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView

        return listView;
    }
}
