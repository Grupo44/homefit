package com.project.homefit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import android.widget.EditText;

class FormCadastro : AppCompatActivity() {

    private EditText edit_nome, edit_email, edit_senha, edit_idade, edit_altura, edit_peso;
    private Button bt_cadastrar;

    override fun onCreate(savedInstanceState: Bundle?) {

        String[] mensagem = {"Preencha todos os campos", "Cadastro realizado com sucesso"};
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

        public void IniciarComponentes() {
            edit_nome = findViewById<EditText>(R.id.edit_nome);
            edit_email = findViewById<EditText>(R.id.edit_email);
            edit_senha = findViewById<EditText>(R.id.edit_senha);
            edit_idade = findViewById<EditText>(R.id.edit_idade);
            edit_altura = findViewById<EditText>(R.id.edit_altura);
            edit_peso = findViewById<EditText>(R.id.edit_peso);
            bt_cadastrar = findViewById<Button>(R.id.bt_cadastrar);
        }

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                 nome = edit_nome.getText().toString();
                 email = edit_email.getText().toString();
                 senha = edit_senha.getText().toString();
                 idade = edit_idade.getText().toString();
                 altura = edit_altura.getText().toString();
                 peso = edit_peso.getText().toString();

                if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()
                    || idade.isEmpty() || altura.isEmpty()|| peso.isEmpty()) {

                    Snackbar snackbar = Snackbar . nake (v, mensagem[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroudTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else{

                }
            }
        });
    }
}