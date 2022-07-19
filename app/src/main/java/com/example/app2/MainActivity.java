package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView signupv,login;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signupv= findViewById(R.id.signup);
        signupv.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.signup:
                Intent activity1=new Intent(this, Signup.class);
                startActivity(activity1);
                break;
        }
    }
}
