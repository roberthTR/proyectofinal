package com.example.for012;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_login extends AppCompatActivity {

    Button btn_login;
    EditText email, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.Correo);
        password = findViewById(R.id.Contrasena);
        btn_login = findViewById(R.id.btn_Ingresar);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailUser= email.getText().toString().trim();
                String passUser= password.getText().toString().trim();

                if(emailUser.isEmpty() && passUser.isEmpty()){
                    Toast.makeText(activity_login.this, "Ingresar los datos", Toast.LENGTH_SHORT).show();
                }else{
                    loginUser(emailUser,passUser);
                }

            }
        });

        

    }

    private void loginUser(String emailUser, String passUser) {

    }
}