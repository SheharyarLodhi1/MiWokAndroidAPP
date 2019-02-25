package com.next.sheharyar.miwok.Model;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class Phrases {

    private String mEnglishPhrasesText;;
    private String mMiWokPhrasesText;
    private int mImageResourceId;
    public String getmEnglishPhrasesText() {
        return mEnglishPhrasesText;
    }

    public void setmEnglishPhrasesText(String mEnglishPhrasesText) {
        this.mEnglishPhrasesText = mEnglishPhrasesText;
    }

    public String getmMiWokPhrasesText() {
        return mMiWokPhrasesText;
    }

    public void setmMiWokPhrasesText(String mMiWokPhrasesText) {
        this.mMiWokPhrasesText = mMiWokPhrasesText;
    }

    public Phrases(String englishPhrases, String miWokPhrases){
        mEnglishPhrasesText = englishPhrases;
        mMiWokPhrasesText = miWokPhrases;

    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Phrases(String englishPhrases, String miWokPhrases, int imageResourceId ){
        mEnglishPhrasesText = englishPhrases;
        mMiWokPhrasesText = miWokPhrases;
        mImageResourceId = imageResourceId;

    }
}
