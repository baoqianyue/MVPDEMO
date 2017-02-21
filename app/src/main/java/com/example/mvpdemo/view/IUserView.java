package com.example.mvpdemo.view;

/**
 * Created by 鲍骞月 on 2017/2/20.
 */

public interface IUserView {
    int getID();

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
