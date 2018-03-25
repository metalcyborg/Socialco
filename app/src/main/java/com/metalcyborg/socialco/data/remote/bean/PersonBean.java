package com.metalcyborg.socialco.data.remote.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cyborg on 25.03.2018.
 */

public class PersonBean {

    @SerializedName("id")
    private int mId;

    @SerializedName("firstName")
    private String mFirstName;

    @SerializedName("lastName")
    private String mLastName;

    @SerializedName("email")
    private String mEmail;

    @SerializedName("avatar")
    private String mAvatar;

    @SerializedName("birthDate")
    private String mBirthDate;

    @SerializedName("created")
    private String mCreated;

    @SerializedName("friendOfMine")
    private boolean mFriendOfMine;

    @SerializedName("myFriend")
    private boolean mMyFriend;

    @SerializedName("fullName")
    private String mFullName;

    @SerializedName("gender")
    private String mGender;

    @SerializedName("pageAvatar")
    private String mPageAvatar;

    @SerializedName("phone")
    private String mPhone;

    @SerializedName("shortName")
    private String mShortName;

    public int getId() {
        return mId;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public String getBirthDate() {
        return mBirthDate;
    }

    public String getCreated() {
        return mCreated;
    }

    public boolean isFriendOfMine() {
        return mFriendOfMine;
    }

    public boolean isMyFriend() {
        return mMyFriend;
    }

    public String getFullName() {
        return mFullName;
    }

    public String getGender() {
        return mGender;
    }

    public String getPageAvatar() {
        return mPageAvatar;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getShortName() {
        return mShortName;
    }
}
