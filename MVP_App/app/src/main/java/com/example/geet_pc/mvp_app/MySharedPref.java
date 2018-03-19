package com.example.geet_pc.mvp_app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by geet-pc on 15/3/18.
 */

public class MySharedPref implements Loginmodel{
    //   *********** setup preferences ********
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private String PREF_NAME = "mvp_prif";
    private String USER_NAME = "username";

    public MySharedPref() {
        sp = MyApplication.getMyApplicationContext().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sp.edit();
    }

    @Override
    public void setusername(String username) {
        editor.putString(USER_NAME, username);
        editor.commit();
    }

    @Override
    public String getusername() {
        return sp.getString(USER_NAME, "no user");
    }
}
