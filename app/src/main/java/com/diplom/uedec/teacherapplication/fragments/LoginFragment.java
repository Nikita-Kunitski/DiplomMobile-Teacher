package com.diplom.uedec.teacherapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.diplom.uedec.teacherapplication.R;

/**
 * Created by uedec on 10.05.2019.
 */

public class LoginFragment extends Fragment {

    TextInputEditText email,password;
    Button login, register;
    ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment, container, false);
        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);
        login = view.findViewById(R.id.log_in);
        register = view.findViewById(R.id.register);
        progressBar=view.findViewById(R.id.progressBar);
        return view;
    }
}
