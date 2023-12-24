package tr.gov.diyanet.degerdondurenmetot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber,editTextNumber2;
    Button button,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber=findViewById(R.id.editTextNumber);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        int number1=Integer.parseInt(editTextNumber.getText().toString());
        int number2=Integer.parseInt(editTextNumber2.getText().toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sonuc=topla(number1,number2);
                Toast.makeText(getApplicationContext(), Integer.toString(sonuc), Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sonuc=fark(number1,number2);
                Toast.makeText(getApplicationContext(), Integer.toString(sonuc), Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sonuc=carp(number1,number2);
                Toast.makeText(getApplicationContext(), Integer.toString(sonuc), Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sonuc=bolum(number1,number2);
                Toast.makeText(getApplicationContext(), Integer.toString(sonuc), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private int topla(int number1,int number2){
        return number1+number2;
    }
    private int fark(int number1,int number2){
        return number1-number2;
    }
    private int carp(int number1,int number2){
        return number1*number2;
    }
    private int bolum(int number1,int number2){
        return number1/number2;
    }
}