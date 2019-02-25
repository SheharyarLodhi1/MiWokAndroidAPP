package com.next.sheharyar.miwok.Model;

/**
 * Created by sheharyar on 2/12/2019.
 */

public class FamilyMembersModel {

    private String mEnglishFamilyText;;
    private String mMiWokFamilyText;
    private int mImageResourceId;

    public String getmEnglishFamilyText() {
        return mEnglishFamilyText;
    }

    public void setmEnglishFamilyText(String mEnglishFamilyText) {
        this.mEnglishFamilyText = mEnglishFamilyText;
    }

    public String getmMiWokFamilyText() {
        return mMiWokFamilyText;
    }

    public void setmMiWokFamilyText(String mMiWokFamilyText) {
        this.mMiWokFamilyText = mMiWokFamilyText;
    }

    public int getmImageResourceId() {return mImageResourceId;}

    public FamilyMembersModel(String familyEnglish, String familyMiWok){
        mEnglishFamilyText = familyEnglish;
        mMiWokFamilyText = familyMiWok;

    }

    public FamilyMembersModel(String familyEnglish, String familyMiWok, int imageResourceId){
        mEnglishFamilyText = familyEnglish;
        mMiWokFamilyText = familyMiWok;
        mImageResourceId = imageResourceId;
    }
}
