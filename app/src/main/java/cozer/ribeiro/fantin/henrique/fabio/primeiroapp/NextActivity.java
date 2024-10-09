package cozer.ribeiro.fantin.henrique.fabio.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Chama o método da classe pai
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next);
        TextView tvText = findViewById(R.id.tvText);
        // Obtém a intent que iniciou a atividade
        Intent it = getIntent();
        // Recupera o texto passado da MainActivity usando a chave "Chave"
        String text = it.getStringExtra("Chave");
        // Define o texto do TextView com o texto recuperado
        tvText.setText(text);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
