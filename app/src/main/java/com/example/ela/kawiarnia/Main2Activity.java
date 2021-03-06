package com.example.ela.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);


        //Lista miejsc
        ArrayList<Cofee> cofees = new ArrayList<>();
        cofees.add(new Cofee("Latte","12.00 zł"));
        cofees.add(new Cofee("Cappucino","15.00 zł"));
        cofees.add(new Cofee("Expresso","22.00 zł"));
        cofees.add(new Cofee("Machiato","32.00 zł"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //Tworzenie Adaptera
        CofeeAdapter cofeeAdapter = new CofeeAdapter(cofees);
        recyclerView.setAdapter(cofeeAdapter);
    }
}
