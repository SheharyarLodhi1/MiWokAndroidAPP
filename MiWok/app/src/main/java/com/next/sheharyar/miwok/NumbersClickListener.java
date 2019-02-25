package com.next.sheharyar.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by sheharyar on 2/11/2019.
 */

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list  of numbers", Toast.LENGTH_LONG).show();
    }
}
