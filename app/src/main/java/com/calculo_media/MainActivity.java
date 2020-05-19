package com.calculo_media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.calculo_media.R;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular, btnLimpar;
    private EditText n1,n2, n3, n4;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui instanciamos os Widgets, ou seja, criamos uma variável para um deles

        n1 = findViewById(R.id.nota1); //minhas plain text
        n2 = findViewById(R.id.nota2);
        n3 = findViewById(R.id.nota3);
        n4 = findViewById(R.id.nota4);

        btnCalcular = findViewById(R.id.calcular);
        btnLimpar = findViewById(R.id.limpar);

        resultado = findViewById(R.id.media);
    }

    //Agora vamos criar os métodos ou ações que cada botão irá fazer ao ser clicado/acionado

    public void Calcular(View view){

        //Aqui estamos pegando os valores dos campos onde o usuário terá inserido os números e assim eles eles estão em formato de CARACTERES (String)

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();
        String C = n3.getText().toString().trim();
        String D = n4.getText().toString().trim();

        //Vamos transformar os caracteres em números para assim conseguirmos fazer as operações desejadas
        Double m1 = Double.parseDouble(A);
        Double m2 = Double.parseDouble(B);
        Double m3 = Double.parseDouble(C);
        Double m4 = Double.parseDouble(D);

        //Aqui realizamos a operação já com ambos em formato de número (DOUBLE)
        Double E = m1+m2+m3+m4/4;

        //E por último vamos colocar o resultado da conta acima na caixa de texto, e para isso temos que transformar o número em carácter, ou seja, em String novamente.
        resultado.setText(E.toString());
    }



    public void Limpar (View view){

        //Aqui vamos "setar" o texto para vazio nos campos desejados
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        resultado.setText("");
    }


}
