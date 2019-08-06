package com.arnaldo.app_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Inicializar
    private EditText et_valor1, et_valor2;
    private CheckBox cb_suma, cb_resta;
    private TextView tv_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar las variables con el diseño
        et_valor1 = (EditText) findViewById(R.id.et_valor1);
        et_valor2 = (EditText) findViewById(R.id.et_valor2);
        cb_suma = (CheckBox) findViewById(R.id.cb_suma);
        cb_resta = (CheckBox) findViewById(R.id.cb_resta);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
    }

    //Metodo calcular
    public void Calcular(View v) {

        if (cb_suma.isChecked() == true && cb_resta.isChecked() == true) { //Si la suma y la resta estan seleccionados
            int resultadosuma = Integer.parseInt(et_valor1.getText().toString()) + Integer.parseInt(et_valor2.getText().toString());
            int resultadoresta = Integer.parseInt(et_valor1.getText().toString()) - Integer.parseInt(et_valor2.getText().toString());
            tv_resultado.setText("La suma es: " + resultadosuma + " / La resta es: " + resultadoresta);
        } else if (cb_suma.isChecked() == true) { //Si solo la suma esta seleccionado
            int resultado = Integer.parseInt(et_valor1.getText().toString()) + Integer.parseInt(et_valor2.getText().toString());
            tv_resultado.setText("La suma es: " + resultado);
        } else if (cb_resta.isChecked() == true) { //Si solo la resta esta seleccionado
            int resultado = Integer.parseInt(et_valor1.getText().toString()) - Integer.parseInt(et_valor2.getText().toString());
            tv_resultado.setText("La resta es: " + resultado);
        }
    }
}
