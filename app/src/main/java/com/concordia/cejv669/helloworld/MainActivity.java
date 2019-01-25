package com.concordia.cejv669.helloworld;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* int x = 2;
        int y = x +2;*/

       // Log.e("MYERROR", "This is a description of the log entry");

        Button b1 = findViewById(R.id.btn_showMessage);
        final EditText t1 = findViewById(R.id.edit_name);
        final TextView tv1 = findViewById(R.id.lbl_result);
        final String enteredName = t1.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tv1.setText("Your name in reverse is ".concat(new StringBuilder(t1.getText()).reverse().toString()));
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                Toast.makeText(getApplicationContext(), "Hello ".concat(t1.getText().toString()), Toast.LENGTH_LONG).show();
            }
        });
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
