package com.pgrsoft.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    //declarar una varaible de instancia de tipo editText, TextView
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.display);


    }

    //crear un metodo que hace la suma y de los numeros
    public void calcularView(View view){
        Log.d("info",  "ENTRAMOS EN CALCULAR");

        //  1 recoger el valor de EditText
        //  2 recoger el valor que hay en display
        // 3. Llevar acabo la suma
        //RECUPERER LOS ID DE LAS INTERFACES GRAFICAS
        String strOperando1 = editText.getText().toString();
        String strOperando2 = textView.getText().toString();

        // EN ESTA PARTE DEL CODIGO LO QUE HACEMOS ES CONCERTIR LOS EDITEXT Y TEXTvIEW EN INTEGER
        int operando1 = Integer.parseInt(strOperando1);
        int operando2 = Integer.parseInt(strOperando2);
        // ES PARA CALCULAR LOS 2 INTEGERS PARA PODER HACER LA SUMA
        textView.setText(String.valueOf(operando1 + operando2));
    }
}
