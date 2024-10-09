package cozer.ribeiro.fantin.henrique.fabio.primeiroapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btn_enviar = findViewById(R.id.btnEnviar);
        EditText etText = findViewById(R.id.etText);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = etText.getText().toString();
                Intent it = new Intent(MainActivity.this, NextActivity.class);
                it.putExtra("Chave",text);
                startActivity(it);
            }
        });
    }
}