package com.example.geet_pc.mvp_app;

/**
 * Created by geet-pc on 14/3/18.
 */

public interface LoginView {
    void onEmailerror();
    void onPassworderror();
    void setUserName(String username);
    void onLogin();
}
