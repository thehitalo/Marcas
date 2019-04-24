package sp.senac.br.marcas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    public void abrirPersonagem1(View view) {
        Intent intent = new Intent(Menu_Activity.this, Facebook_Activity.class);
        startActivity(intent);
    }

    public void abrirPersonagem2(View view) {
        Intent intent = new Intent(Menu_Activity.this, Youtube_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem3(View view) {
        Intent intent = new Intent(Menu_Activity.this, Whatsapp_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem4(View view) {
        Intent intent = new Intent(Menu_Activity.this, Wechat_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem5(View view) {
        Intent intent = new Intent(Menu_Activity.this, Instagram_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem6(View view) {
        Intent intent = new Intent(Menu_Activity.this, Qq_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem7(View view) {
        Intent intent = new Intent(Menu_Activity.this, Qzone_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem8(View view) {
        Intent intent = new Intent(Menu_Activity.this, Twitter_Activity.class);
        startActivity(intent);
    }
    public void abrirPersonagem9(View view) {
        Intent intent = new Intent(Menu_Activity.this, Reddit_Activity .class);
        startActivity(intent);
    }
    public void abrirPersonagem10(View view) {
        Intent intent = new Intent(Menu_Activity.this, Linkedin_Activity.class);
        startActivity(intent);
    }
}
