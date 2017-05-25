package com.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText main_activity_edtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_activity_edtxt = (EditText) findViewById(R.id.main_activity_edtxt);
        main_activity_edtxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()>0){
                   if(s.toString().charAt(0)==' '){
                       if(s.toString().length()==1) {
                           main_activity_edtxt.setText("");
                           main_activity_edtxt.setSelection(0);
                       }else if(s.toString().length()>1){
                           main_activity_edtxt.setText(s.toString().trim());
                       }
                   }
                }
            }
        });
    }
}
