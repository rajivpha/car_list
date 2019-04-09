package com.company.assignmentquestion4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText make,year,color,price,engine;
    private Button create;
    private TextView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize(){

        make= findViewById(R.id.et_make);
        year= findViewById(R.id.et_year);
        color= findViewById(R.id.et_color);
        price= findViewById(R.id.et_purchaseprice);
        create= findViewById(R.id.btn_create);
        engine= findViewById(R.id.et_engine);
        view=findViewById(R.id.tv_result);

        create.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String manufacturer = make.getText().toString();
        String madeyear = year.getText().toString();
        String colorr = color.getText().toString();
        String purchaseprice = price.getText().toString();
        String enginesize = engine.getText().toString();

        view.setText(view.getText().toString()+"\r\n\n Make: "+manufacturer+" Year: "+madeyear+" Color: "+colorr+" Price: "+purchaseprice+" Engine: "+enginesize);



    }
}
