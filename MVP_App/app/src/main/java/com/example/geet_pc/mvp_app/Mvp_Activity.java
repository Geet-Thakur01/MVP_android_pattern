package com.example.geet_pc.mvp_app;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mvp_Activity extends AppCompatActivity implements LoginView, View.OnClickListener {
    TextInputLayout email, password;
    Button submit;
    TextView loginuser;
    LoginPresenterInterface presenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);
        loginuser=findViewById(R.id.loginuser);
        submit.setOnClickListener(this);
//        initialize presenter
        presenterInterface = new PresenterClass(this);
    }

    @Override
    public void onEmailerror() {
        email.setError("not Empty !");
    }

    @Override
    public void onPassworderror() {
        password.setError("not Empty !");
    }

    @Override
    public void onLogin() {
        Toast.makeText(this, "login success !!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setUserName(String username) {
        loginuser.setText(username);
    }

    @Override
    public void onClick(View view) {
        presenterInterface.checkvalidateCredential(email.getEditText().getText().toString(), password.getEditText().getText().toString());
    }
}
