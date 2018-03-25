package com.metalcyborg.socialco.data.entity;

/**
 * Created by cyborg on 25.03.2018.
 */
public class Person {

    private int mId;
    private String mFirstName;
    private String mLastName;
    private String mShortName;
    private String mEmail;
    private String mAvatar;
    private String mBirthDate;
    private String mCreated;
    private boolean mFriendOfMine;
    private boolean mMyFriend;
    private String mFullName;
    private String mGender;
    private String mPageAvatar;
    private String mPhone;

    public Person(int id, String firstName, String lastName, String email, String avatar) {
        mId = id;
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
        mAvatar = avatar;
    }

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

    public void setShortName(String shortName) {
        mShortName = shortName;
    }

    public void setBirthDate(String birthDate) {
        mBirthDate = birthDate;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

    public void setFriendOfMine(boolean friendOfMine) {
        mFriendOfMine = friendOfMine;
    }

    public void setMyFriend(boolean myFriend) {
        mMyFriend = myFriend;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public void setPageAvatar(String pageAvatar) {
        mPageAvatar = pageAvatar;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }
}
