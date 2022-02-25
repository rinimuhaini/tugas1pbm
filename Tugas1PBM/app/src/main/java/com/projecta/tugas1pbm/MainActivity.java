package com.projecta.tugas1pbm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText editTxtUsername;
    private String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
    }

    public void initView() {
        btnLogin = findViewById(R.id.btn_login);
        editTxtUsername = findViewById(R.id.edittxt_username);
    }

    public void setData() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set data
                username = editTxtUsername.getText().toString();

                //action
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }


}