package com.example.hp.mockproject.Presenter;

import android.text.TextUtils;

import com.example.hp.mockproject.View.ILoginView;

/**
 * Created by HP on 3/17/2017.
 */
public class LoginPresenter extends BasePresenter<ILoginView> {


    @Override
    protected void onAttached() {
        super.onAttached();
    }

    public void checkEmpty(String msg) {
        if (TextUtils.isEmpty(msg)) {

            getView().showToast();
        } else {
            getView().startHomePage();
        }


    }
}
