package com.example.mvpdemo.model;

import com.example.mvpdemo.bean.UserBean;

import java.util.ArrayList;

/**
 * Created by 鲍骞月 on 2017/2/21.
 */

public class UserModel implements IUserModel {

    private int mId;
    private String mFirstName;
    private String mLastName;
    private ArrayList<UserBean> mUesrArray = new ArrayList<>();


    @Override
    public void setID(int id) {
        mId = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public UserBean load(int id) {
        mId = id;
        UserBean userBean = mUesrArray.get(mId);
        return userBean;
    }
}
