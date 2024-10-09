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
        super.onCreate(savedInstanceState); // Chama o método da classe pai
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Verifica o id e encontra ele, o retornando
        Button btn_enviar = findViewById(R.id.btnEnviar);
        EditText etText = findViewById(R.id.etText);

        // Configura um listener para o clique do botão
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Pega o texto digitado no campo de texto
                String text = etText.getText().toString();
                // Cria uma nova intent para iniciar a NextActivity
                Intent it = new Intent(MainActivity.this, NextActivity.class);
                // Adiciona o texto a ser passado para próxima activity
                it.putExtra("Chave", text);
                // Inicia a NextActivity
                startActivity(it);
            }
        });
    }
}
