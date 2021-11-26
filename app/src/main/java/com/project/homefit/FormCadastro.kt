package com.project.homefit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class FormCadastro : AppCompatActivity() {

//    private EditText edit_nome, edit_email, edit_senha, edit_idade, edit_altura, edit_peso;
//    private Button bt_cadastrar;
//    String[] mensagem = {"Preencha todos os campos", "Cadastro realizado com sucesso"};

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

//        getSupportActionBar().hide();
//        IniciarComponentes();

//        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//
//                String nome = edit_nome.getText().toString();
//                String email = edit_email.getText().toString();
//                String senha = edit_senha.getText().toString();
//                String idade = edit_idade.getText().toString();
//                String altura = edit_altura.getText().toString();
//                String peso = edit_peso.getText().toString();
//
//                if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()
//                    || idade.isEmpty() || altura.isEmpty()|| peso.isEmpty()){
//
//                    Snackbar snackbar = Snackbar.nake(v, )
//                }
//            }
//        });
    }

//    private void IniciarComponentes(){
//        edit_nome = findViewById(R.id.edit_nome);
//        edit_email = findViewById(R.id.edit_email);
//        edit_senha = findViewById(R.id.edit_senha);
//        edit_idade = findViewById(R.id.edit_idade);
//        edit_altura = findViewById(R.id.edit_altura);
//        edit_peso = findViewById(R.id.edit_peso);
//        bt_cadastrar = findViewById(R.id.bt_cadastrar);
//    }

}