package br.com.whatsappandroid.cursoandroid.whatsapp.activity;

import android.content.SharedPreferences;
import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import java.util.HashMap;

import br.com.whatsappandroid.cursoandroid.whatsapp.R;
import br.com.whatsappandroid.cursoandroid.whatsapp.helper.Preferencias;

public class ValidadorActivity extends AppCompatActivity {

    private EditText codigoValidacao;
    private Button botaoValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validador);

//        codigoValidacao = findViewById(R.id.editTextCodigoValidacao);
//        botaoValidar = findViewById(R.id.buttonValidar);
//
//        SimpleMaskFormatter simpleMaskCodigoValidacao = new SimpleMaskFormatter("NNNN");
//        MaskTextWatcher maskCodigoValidacao = new MaskTextWatcher(codigoValidacao, simpleMaskCodigoValidacao);
//
//        codigoValidacao.addTextChangedListener(maskCodigoValidacao);
//
//        botaoValidar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //recuperar dados das preferências do usuário
//                Preferencias preferencias = new Preferencias(ValidadorActivity.this);
//
//                HashMap<String, String> usuario = preferencias.getDadosUsuario();
//
//                String tokenGerado = usuario.get("token");
//                String tokenDigitado = codigoValidacao.getText().toString();
//
//                if(tokenDigitado.equals(tokenGerado)){
//                    Toast.makeText(ValidadorActivity.this, "Token Validado!!", Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(ValidadorActivity.this, "Token NÃO Validado!!", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
    }
}
