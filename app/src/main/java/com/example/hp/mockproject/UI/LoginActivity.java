package com.example.hp.mockproject.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.mockproject.Presenter.LoginPresenter;
import com.example.hp.mockproject.R;
import com.example.hp.mockproject.View.ILoginView;

public class LoginActivity extends AppCompatActivity implements ILoginView {
    private Button login_btn;
    private EditText username;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialise();
    }

    private void initialise() {
        login_btn = (Button) findViewById(R.id.btn_login);
        login_btn.setOnClickListener(this);
        loginPresenter = new LoginPresenter();
        loginPresenter.attachView(this);
        username = (EditText) findViewById(R.id.edt_name);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                loginPresenter.checkEmpty(username.getText().toString());
                break;
        }

    }

    @Override
    public void startHomePage() {
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));

    }

    @Override
    public void showToast() {
        Toast.makeText(LoginActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();

    }
}
