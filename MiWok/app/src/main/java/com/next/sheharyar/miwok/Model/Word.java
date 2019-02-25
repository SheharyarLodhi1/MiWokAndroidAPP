package com.next.sheharyar.miwok.Model;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class Word {

    private String mDefaultTranslation; // m for a member of a class
    private String mMiWoktranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED; // setting the image with no image state by default. now soon this variable updated we know the word has an image ..

    private int mAudioResourceId;
    // static variable and setting this to a constant value -1 because is out of the range of all the possible resource id's ..
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miWokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiWoktranslation = miWokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miWokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiWoktranslation = miWokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiWoktranslation() {
        return mMiWoktranslation;
    }

    public void setmMiWoktranslation(String mMiWoktranslation) {
        this.mMiWoktranslation = mMiWoktranslation;
    }



    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether  or not there is an image for this word ..
     * @return
     */

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED; // the result of this solution would be either true or false ..
    }
}
