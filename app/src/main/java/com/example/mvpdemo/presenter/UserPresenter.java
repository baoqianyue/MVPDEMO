package com.example.mvpdemo.presenter;

import com.example.mvpdemo.bean.UserBean;
import com.example.mvpdemo.model.IUserModel;
import com.example.mvpdemo.model.UserModel;
import com.example.mvpdemo.view.IUserView;

/**
 * Created by 鲍骞月 on 2017/2/21.
 */

public class UserPresenter {
    private IUserModel mUserModel;
    private IUserView mUserView;


    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getmFirstName());
        mUserView.setLastName(user.getmLastName());

    }
}
