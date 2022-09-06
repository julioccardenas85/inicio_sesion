package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        text1 = findViewById(R.id.user);
        String user = text1.getText().toString();

        text2 = findViewById(R.id.password);
        String password = text2.getText().toString();

        if (user.equals("julio") && password.equals("123")) {
            Toast.makeText(this,"Bienvenido " + user,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);

        } else {
            Toast.makeText(this,"Los datos ingresados son incorrectos",Toast.LENGTH_SHORT).show();
        }
    }
}