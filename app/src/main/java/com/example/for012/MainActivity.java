package com.example.for012;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

        btn_add = findViewById(R.id.btn_add);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.foro_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.op_crear){
            Intent i = new Intent(MainActivity.this, CreateForoActivity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Crear", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op_buscar){
            Toast.makeText(getApplicationContext(),"Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op_archivar){
            Toast.makeText(getApplicationContext(),"Archivar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op_login){
            Intent i = new Intent(MainActivity.this, activity_login.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Iniciar Sección", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op_register){
            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Registarse", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}