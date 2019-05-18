package com.example.proyecto005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText editText1,editText2;
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView3 = (TextView)findViewById(R.id.textView3);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        //se muestran las opciones del Spinner(Combobox)
        String [] opciones={"Sumar","Restar","Multiplicar","Dividir","Factorizar", "Imaginarios"};
        //
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void operar(View view) {

        String valor1=editText1.getText().toString();
        String valor2=editText2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);

        String selec=spinner1.getSelectedItem().toString();

        if (selec.equals("Sumar")) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            textView3.setText(resu);
        } else
        if (selec.equals("Restar")) {
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            textView3.setText(resu);
        }
        else
        if (selec.equals("Multiplicar")) {
            int multi=nro1*nro2;
            String resu=String.valueOf(multi);
            textView3.setText(resu);

        }
        else
        if (selec.equals("Dividir")) {
            int divi=nro1/nro2;
            String resu=String.valueOf(divi);
            textView3.setText(resu);
        }
        else
        if(selec.equals("Factorizar")){
            textView3.setText("No hace nada esta opcion");
        }
        else
        if(selec.equals("Imaginarios")){
            textView3.setText("Nada reelevante para esta opcion");
        }
    }
}
