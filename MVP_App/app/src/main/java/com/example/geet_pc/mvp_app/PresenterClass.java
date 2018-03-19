package com.example.geet_pc.mvp_app;

import android.text.TextUtils;

/**
 * Created by geet-pc on 14/3/18.
 */

public class PresenterClass implements LoginPresenterInterface {
    LoginView loginView;
    Loginmodel loginmodel;

    public PresenterClass(LoginView loginView) {
        this.loginView = loginView;
        this.loginmodel = new MySharedPref();
        setAllDataFromSF();
    }

    @Override
    public void setAllDataFromSF() {
        loginView.setUserName(loginmodel.getusername());
    }

    @Override
    public void checkvalidateCredential(String email, String password) {
        if (TextUtils.isEmpty(email)) {
            loginView.onEmailerror();
        } else if (TextUtils.isEmpty(password)) {
            loginView.onPassworderror();
        } else {
            loginView.onLogin();
            loginmodel.setusername(email);
            setAllDataFromSF();
        }
    }
}
