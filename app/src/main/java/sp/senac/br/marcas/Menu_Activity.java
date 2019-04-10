package sp.senac.br.marcas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    public void abrirPersonagem1(View view) {
        Intent intent = new Intent(Menu_Activity.this, Amazon_Activity.class);
        startActivity(intent);
    }

    public void abrirPersonagem2(View view) {
        Intent intent = new Intent(Menu_Activity.this, Apple_Activity.class);
        startActivity(intent);
    }
}
