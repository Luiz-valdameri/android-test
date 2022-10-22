package br.edu.unisep.devmob.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView tvError = findViewById(R.id.tvError);
        EditText etUser = findViewById(R.id.etUser);
        EditText etPassword = findViewById(R.id.etPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if("admin".equalsIgnoreCase(etUser.getText().toString()) && "admin".equalsIgnoreCase(etPassword.getText().toString())){
                    Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                    intent.putExtra("name",etUser.getText().toString());
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                    intent.putExtra("name","admin");
                    startActivity(intent);
//                    tvError.setText("Usuario ou senha invalidos!");
                }
            }
        });
    }
}