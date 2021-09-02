package ipn.cecyt9.practica1_calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double num1, num2, resultado;
    String operador;

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickButtonCero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickButtonPunto(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + ".");
    }


    public void onClickOperacionCapturaNumero1(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView){
        operador = "+";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickResta(View miView){
        operador = "-";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickMulplicacion(View miView){
        operador = "*";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickDivision(View miView){
        operador = "/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickPorciento(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView);
        num1 = Double.parseDouble(tv.getText().toString());
        try {
            resultado = num1 * 0.01;
            tv.setText(resultado.toString());
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
        resultado = num1;
    }

    public void onClickRaiz(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        try {
            num1 = Double.parseDouble(tv.getText().toString());
            resultado = Math.sqrt(num1);
            tv.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }


    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        num2 = Double.parseDouble(tv.getText().toString());

        try{
            if(operador.equals("+")){
                resultado = num1 + num2;
            }
            else{
                if(operador.equals("-")){
                    resultado = num1 - num2;
                }
                else{
                    if(operador.equals("/")){
                        resultado = num1 / num2;
                    }
                    else{
                        if(operador.equals("*")){
                            resultado = num1 * num2;
                        }
                    }
                }
            }
            tv.setText(resultado.toString());
        }
        catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
    public  void  onClickborrar (View miView)
    {
        num1 = 0.0 ;
        num2 = 0.0 ;
        TextView tv = (TextView) findViewById (R.id.textView);
        tv . setText (" ");
    }
}