package com.uninorte.calculadoradanielarrubla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //acá las variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        //acá el código

    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    Integer numero1,numero2,resultado;
    String operador;

    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        numero2 = Integer.parseInt(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        tv.setText(resultado.toString());
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        numero1 = Integer.parseInt(tv.getText().toString());
        tv.setText("");
    }

    public void onClickuno(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickdos(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClicktres(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickcuatro(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickcinco(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClicseis(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClicksiete(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickocho(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClicknueve(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickcero(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "0");
    }


}
