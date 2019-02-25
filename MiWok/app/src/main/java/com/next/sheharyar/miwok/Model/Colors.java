package com.next.sheharyar.miwok.Model;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class Colors {

    private String mEnglishColorsText;;
    private String mMiWokColorsText;

    public String getmEnglishColorsText() {
        return mEnglishColorsText;
    }

    public void setmEnglishColorsText(String mEnglishColorsText) {
        this.mEnglishColorsText = mEnglishColorsText;
    }

    public String getmMiWokColorsText() {
        return mMiWokColorsText;
    }

    public void setmMiWokColorsText(String mMiWokColorsText) {
        this.mMiWokColorsText = mMiWokColorsText;
    }

    public Colors(String englishColors, String miWokColors){
        mEnglishColorsText = englishColors;
        mMiWokColorsText = miWokColors;


    }
}
