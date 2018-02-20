package com.itea.grey.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button gButton;
    private Button fButton;
    private Button loginButton;
    private EditText loginText;
    private EditText passText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    gButton = (Button)findViewById(R.id.gButton);
    fButton = (Button)findViewById(R.id.fButton);
    loginButton = (Button)findViewById(R.id.loginButton);
    loginText = (EditText)findViewById(R.id.loginText);
    passText = (EditText)findViewById(R.id.passText);

    gButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, R.string.google, Toast.LENGTH_LONG).show();
        }
    });

    fButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, R.string.facebook, Toast.LENGTH_LONG).show();
        }
    });

    loginButton.setOnClickListener(new View.OnClickListener() {

        private String etLogin;
        private String etPasswd ;

        @Override
        public void onClick(View v) {
            etLogin = loginText.getText().toString();
            etPasswd = passText.getText().toString();

            Checker ch = new Checker(etLogin, etPasswd);

            if(!ch.checkLogin(etLogin)) {
                loginText.setError("Incorrect Login");
            }
            if (!ch.checkPassword(etPasswd)){
                    passText.setError("Incorrect Password");
                }
            Toast.makeText(MainActivity.this, R.string.welcome, Toast.LENGTH_LONG).show();
        }
    });
    }
}
