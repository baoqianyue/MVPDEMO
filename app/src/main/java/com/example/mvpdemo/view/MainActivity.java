package com.example.mvpdemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvpdemo.R;
import com.example.mvpdemo.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {


    private EditText mFirstNameEditText, mLastNameEditText, mIDEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstNameEditText = (EditText) findViewById(R.id.firstname_edittext);
        mLastNameEditText = (EditText) findViewById(R.id.lastname_edittext);
        mIDEditText = (EditText) findViewById(R.id.id_edittext);
        mSaveButton = (Button) findViewById(R.id.btn_store);
        mLoadButton = (Button) findViewById(R.id.btn_read);
        mUserPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);
    }

    @Override
    public int getID() {
        return Integer.getInteger(mIDEditText.getText().toString());
    }

    @Override
    public String getFirstName() {
        return mFirstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastNameEditText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastNameEditText.setText(lastName);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_store:
                mUserPresenter.saveUser(getID(),
                        getFirstName(), getLastName());
                break;
            case R.id.btn_read:
                mUserPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }
}
