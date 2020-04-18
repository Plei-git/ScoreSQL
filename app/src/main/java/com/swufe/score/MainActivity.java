package com.swufe.score;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    EditText inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView) findViewById(R.id.showText);
        //out.setText("Score");

        inp = (EditText)findViewById(R.id.inpText);
        //String str = inp.getText().toString();

        Button btn = (Button)findViewById(R.id.btn1);
        //btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.i("click","onClick333...");

        //TextView tv = (TextView) findViewById(R.id.showText);
        //tv.setText("Score");

        //EditText inp = (EditText)findViewById(R.id.inpText);
        String str = inp.getText().toString();

        out.setText("Score"+str);
    }
    public void btnClick(View btn){
        Log.i("click","btnClick called...");
    }
}
