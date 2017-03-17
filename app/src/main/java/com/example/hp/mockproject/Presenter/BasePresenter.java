package com.example.hp.mockproject.Presenter;

import com.example.hp.mockproject.View.IBaseView;

/**
 * Created by HP on 3/17/2017.
 */
public class BasePresenter<VIEW extends IBaseView> {
    VIEW view;

    public void attachView(VIEW view) {
        this.view = view;
    }

    protected void onAttached() {

    }

    public VIEW getView() {
        return view;
    }
}
