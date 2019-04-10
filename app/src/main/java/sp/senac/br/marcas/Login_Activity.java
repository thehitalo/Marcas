package sp.senac.br.marcas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    EditText usuario, senha;
    Button entrar, sair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        usuario = (EditText) findViewById(R.id.edtUsuario);
        senha = (EditText) findViewById(R.id.edtSenha);

        entrar = (Button) findViewById(R.id.btnEntrar);
        sair = (Button) findViewById(R.id.btnSair);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bem vindo ao Sistema", Toast.LENGTH_SHORT).show();
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txUsuario = usuario.getText().toString();
                String txSenha = senha.getText().toString();

                if (txUsuario.equals("senac") && txSenha.equals("senac")) {

                    Intent abrir = new Intent(Login_Activity.this, Menu_Activity.class);
                    startActivity(abrir);

                    /*Toast.makeText(getApplicationContext(), "Bem vindo ao Sistema", Toast.LENGTH_SHORT).show();*/
                    //Finalizando a janela de login
                    finish();
                } else{
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();

                    usuario.setText("");
                    senha.setText("");
                    usuario.requestFocus();

                }
            }
        });

    }
}