package com.project.homefit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login);
//        getSupportActionBar().hide();
    }

    override fun getSupportActionBar(): ActionBar? {
        return super.getSupportActionBar();
    }

}