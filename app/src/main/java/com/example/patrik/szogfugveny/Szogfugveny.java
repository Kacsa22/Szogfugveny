package com.example.patrik.szogfugveny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class Szogfugveny extends AppCompatActivity {

    //declaration

    EditText bemenetEdit,kimenetEdit;
    Button   sinButton, asinButton, cosButton, acosButton, tanButton, atanButton, ctgButton, actgButton;
    Double eredmeny;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szogfugveny);
        init();
    }

    void init(){
        //find widgets

        bemenetEdit  = findViewById(R.id.bemenetEdit);
        kimenetEdit  = findViewById(R.id.kimenetEdit);
        sinButton    = findViewById(R.id.sinButton);
        asinButton   = findViewById(R.id.asinButton);
        cosButton    = findViewById(R.id.cosButton);
        acosButton   = findViewById(R.id.acosButton);
        tanButton    = findViewById(R.id.tanButton);
        atanButton   = findViewById(R.id.atanButton);
        ctgButton    = findViewById(R.id.ctgButton);
        actgButton   = findViewById(R.id.actgButton);
    }

    Double degtorad(Double deg){
        return deg*(Math.PI/180);
    }

    Double radtodeg(Double rad){
        return rad*(180/Math.PI);
    }


    public void sin(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());
            eredmeny = degtorad(eredmeny);
            eredmeny = Math.sin(eredmeny);
            kimenetEdit.setText(String.valueOf(eredmeny));
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }

    public void asin(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());

            if ((eredmeny >= -1) && (eredmeny <= 1)) {
                eredmeny = Math.asin(eredmeny);
                eredmeny = radtodeg(eredmeny);
                kimenetEdit.setText(String.valueOf(eredmeny));
            }

            else{
                Toast.makeText(Szogfugveny.this,"Az ARCSIN függvény értelmezési tartománya: [-1,1]",Toast.LENGTH_LONG).show();
            }
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }

    public void cos(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());
            eredmeny = degtorad(eredmeny);
            eredmeny = Math.cos(eredmeny);
            kimenetEdit.setText(String.valueOf(eredmeny));
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }

    public void acos(View v){

            try{
                eredmeny = Double.parseDouble(bemenetEdit.getText().toString());

                if ((eredmeny >= -1) && (eredmeny <= 1)) {
                    eredmeny = Math.acos(eredmeny);
                    eredmeny = radtodeg(eredmeny);
                    kimenetEdit.setText(String.valueOf(eredmeny));
                }

                else{
                    Toast.makeText(Szogfugveny.this,"Az ARCCOS függvény értelmezési tartománya: [-1,1]",Toast.LENGTH_LONG).show();
                }
            }

            catch (Exception e){
                Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
            }

        }

    public void tan(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());
            eredmeny = degtorad(eredmeny);
            eredmeny = Math.tan(eredmeny);
            kimenetEdit.setText(String.valueOf(eredmeny));
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }

    public void atan(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());
            eredmeny = Math.atan(eredmeny);
            eredmeny = radtodeg(eredmeny);
            kimenetEdit.setText(String.valueOf(eredmeny));
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }

    public void ctg(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());
            eredmeny = degtorad(eredmeny);
            eredmeny = 1/(Math.tan(eredmeny));
            kimenetEdit.setText(String.valueOf(eredmeny));
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }

    public void actg(View v){

        try{
            eredmeny = Double.parseDouble(bemenetEdit.getText().toString());
            eredmeny = Math.atan(1/eredmeny);
            eredmeny = radtodeg(eredmeny);
            kimenetEdit.setText(String.valueOf(eredmeny));
        }

        catch (Exception e){
            Toast.makeText(Szogfugveny.this, "A bementnek egy számnak kell lennie!", Toast.LENGTH_LONG).show();
        }

    }
}
