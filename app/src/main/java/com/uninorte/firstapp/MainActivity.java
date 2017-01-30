package com.uninorte.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GetMinGrade(View view) {

      Float Gr1=Float.parseFloat(((EditText)findViewById(R.id.Grade1)).getText().toString());
        Float Gr2=Float.parseFloat(((EditText)findViewById(R.id.Grade2)).getText().toString());
        Float Gr3=Float.parseFloat(((EditText)findViewById(R.id.Grade3)).getText().toString());
        float Gr4=(3.5f*4f)-Gr1-Gr2-Gr3;
if (Gr1>5 || Gr2>5 || Gr3>5)
{


}
        if (Gr4<=0)
        {
            Toast.makeText(this,"Felicidades no necesitas nota",Toast.LENGTH_LONG).show();
        }else if(Gr4<=5)
        {
                Toast.makeText(this,"Lastima, necesitas:"+Float.toString(Gr4) ,Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"No hay nada que puedas hacer" ,Toast.LENGTH_LONG).show();
        }






    }
}
