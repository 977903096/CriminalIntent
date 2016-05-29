package com.example.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by yongchao on 2016/5/29.
 */
public class CrimeFragment  extends Fragment{
    private Crime mCrime;
    private EditText  mEditText;
    public static final String tag = "******************";

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragmentlayout,container,false);
        mEditText = (EditText) v.findViewById(R.id.editText);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(tag,"文本改变前");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mEditText.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(tag,"文本改变后");
            }
        });
        return v;
    }
}
