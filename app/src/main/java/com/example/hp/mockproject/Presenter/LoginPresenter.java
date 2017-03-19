package com.example.hp.mockproject.Presenter;


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
        if (msg.length() == 0) {

            getView().showToast();
        } else {
            getView().startHomePage();
        }


    }
}
