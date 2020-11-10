package com.viber.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void toRupee(View view){
        TextView indollar = (TextView) (findViewById(R.id.dollarAmt));
        Double dollar = Double.parseDouble(indollar.getText().toString());
        Double rupees = dollar*74.59;
        String rupeess = Double.toString(rupees);
        Toast.makeText(this, "in Rupees "+rupeess, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}