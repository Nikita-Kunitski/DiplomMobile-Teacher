package com.diplom.uedec.teacherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.diplom.uedec.teacherapplication.fragments.LoginFragment;
import com.diplom.uedec.teacherapplication.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    public void registerFragments() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new RegisterFragment()).commit();
    }
    public void loginFragments() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new LoginFragment()).commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new LoginFragment())
                    .commit();
        }
    }
}
