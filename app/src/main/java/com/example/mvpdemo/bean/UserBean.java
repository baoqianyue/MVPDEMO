package com.example.mvpdemo.bean;

/**
 * Created by 鲍骞月 on 2017/2/20.
 */

public class UserBean {
    private String mFirstName;
    private String mLastName;

    public UserBean(String firstName, String lastName) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }


    public String getmLastName() {
        return mLastName;
    }


}
