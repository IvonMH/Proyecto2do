package com.sandramh.lugaresapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtUsuario;
    private EditText txtContraseña;
    private Button btnOk;
    private Button btnCancel;
    private String Usu="123";
    private String Cont="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk=(Button)findViewById(R.id.btnOk);
        btnCancel=(Button)findViewById(R.id.btnCan);
        txtUsuario=(EditText)findViewById(R.id.txtUsu);
        txtContraseña=(EditText)findViewById(R.id.txtCont);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOk:
                if (txtUsuario.getText().toString().equals(Usu)&& txtContraseña.getText().toString().equals(Cont)){
                    Intent intent = new Intent(getApplication(), first.class );
                    startActivity(intent);

            }

            else {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
